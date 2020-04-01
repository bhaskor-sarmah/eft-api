package com.bohniman.eftapi.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.bohniman.eftapi.model.FtDevice;
import com.bohniman.eftapi.model.TransSuspect;
import com.bohniman.eftapi.payload.FtMasterTableSync;
import com.bohniman.eftapi.payload.FtMasterVersion;
import com.bohniman.eftapi.payload.FtPayload;
import com.bohniman.eftapi.payload.SyncDocPayload;
import com.bohniman.eftapi.payload.TransFtCaseRegisterPojo;
import com.bohniman.eftapi.payload.TransFtCaseRegisterSync;
import com.bohniman.eftapi.repository.FtDeviceRepository;
import com.bohniman.eftapi.repository.MasterFtDocumentRepository;
import com.bohniman.eftapi.repository.TransFtCaseRegisterRepository;
import com.bohniman.eftapi.repository.TransFtOfflineDocRepository;
import com.bohniman.eftapi.repository.TransSuspectRepository;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * FtService
 */
@Service
public class FtService {

    
	@Autowired
	FtDeviceRepository deviceRepository;
    
	@Autowired
	TransSuspectRepository transSuspectRepository;

	@Autowired
	TransFtOfflineDocRepository transFtOfflineDocRepository;

	@Autowired
	TransFtCaseRegisterRepository transFtCaseRegisterRepository;

	@Autowired
	MasterFtDocumentRepository masterFtDocumentRepository;
	
    @Value("${app.file-upload}")
    String path;

	public FtPayload getFt(String macId) {
		FtPayload ft = null;
		FtDevice device = deviceRepository.findByMacId(macId);
		if (null != device) {
			ft = new FtPayload();
			ft.setFtCode(device.getFt().getFtCode());
			ft.setFtName(device.getFt().getFtName());
		}
		return ft;
	}

	public boolean saveOfflineDoc(SyncDocPayload syncDocPayload){
		syncDocPayload.getTransFtOfflineDoc().setSuspect(this.getSuspectById(syncDocPayload.getTransFtOfflineDoc().getSuspect().getSuspectId()));
		boolean result = false;

		try{
			String file =path+"OFFLINE"+syncDocPayload.getTransFtOfflineDoc().getDocPath();
			String folder = file.replaceAll(new File(file).getName(), "");
			FileUtils.forceMkdir(new File(folder));
			FileUtils.writeByteArrayToFile(new File(file), syncDocPayload.getDoc());
			syncDocPayload.getTransFtOfflineDoc().setDocId(null);
			syncDocPayload.getTransFtOfflineDoc().setFtCaseRegister(null);
			syncDocPayload.getTransFtOfflineDoc().setFtCaseId(syncDocPayload.getFtCaseId());
			transFtOfflineDocRepository.save(syncDocPayload.getTransFtOfflineDoc());
			result = true;
		}catch(Exception e){
			System.out.println("Exception : "+e.getMessage());
		}

        return result;
	}

	public TransSuspect getSuspectById(String suspectId){
		return transSuspectRepository.findById(suspectId).get();
	}

	public FtMasterTableSync getFtMasterTableSync(FtMasterVersion ftMasterVersion) {
		if(ftMasterVersion.getTableName().equals("FtCaseRegister") && ftMasterVersion.getMaxId() >= 0 && !ftMasterVersion.getFinalFtCode().equals("")){
			// Object objList = 
			List<TransFtCaseRegisterPojo> ftCaseRegisterList = transFtCaseRegisterRepository.findByFtCaseIdGreaterThan(Long.valueOf(ftMasterVersion.getMaxId()), ftMasterVersion.getFinalFtCode());
			List<TransFtCaseRegisterSync> ftCaseRegisterListSync = new ArrayList<>();
			for(TransFtCaseRegisterPojo obj : ftCaseRegisterList){
				ftCaseRegisterListSync.add(obj.getSuspectSync());
			}
			FtMasterTableSync ftMasterTableSync = new FtMasterTableSync();
			if(!ftCaseRegisterListSync.isEmpty()){
				ftMasterTableSync.setFound(1);
			}else{
				ftMasterTableSync.setFound(0);
			}
			ftMasterTableSync.setTransFtCaseRegisterList(ftCaseRegisterListSync);
			ftMasterTableSync.setMasterFtDocumentList(masterFtDocumentRepository.findAll());
			return ftMasterTableSync;
		}
		return null;
	}
}