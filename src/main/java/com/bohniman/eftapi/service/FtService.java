package com.bohniman.eftapi.service;

import java.io.File;

import com.bohniman.eftapi.model.AppDevice;
import com.bohniman.eftapi.model.FtDevice;
import com.bohniman.eftapi.model.TransSuspect;
import com.bohniman.eftapi.payload.FtPayload;
import com.bohniman.eftapi.payload.SyncDocPayload;
import com.bohniman.eftapi.payload.ThanaPayload;
import com.bohniman.eftapi.repository.DeviceRepository;
import com.bohniman.eftapi.repository.FtDeviceRepository;
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
}