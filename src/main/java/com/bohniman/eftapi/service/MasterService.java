package com.bohniman.eftapi.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bohniman.eftapi.model.AppMasterVersion;
import com.bohniman.eftapi.repository.AddressTypeRepository;
import com.bohniman.eftapi.repository.AppDevicePinRepository;
import com.bohniman.eftapi.repository.CountryRepository;
import com.bohniman.eftapi.repository.DistrictRepository;
import com.bohniman.eftapi.repository.EmploymentTypeRepository;
import com.bohniman.eftapi.repository.GenderRepository;
import com.bohniman.eftapi.repository.LacRepository;
import com.bohniman.eftapi.repository.MaritalStatusRepository;
import com.bohniman.eftapi.repository.AppMasterVersionRepository;
import com.bohniman.eftapi.repository.OccupationRepository;
import com.bohniman.eftapi.repository.RelationRepository;
import com.bohniman.eftapi.repository.ReligionRepository;
import com.bohniman.eftapi.repository.RouteRepository;
import com.bohniman.eftapi.repository.StateRepository;
import com.bohniman.eftapi.repository.SuspectDocumentRepository;
import com.bohniman.eftapi.repository.ThanaRepository;
import com.bohniman.eftapi.repository.VillageRepository;
import com.bohniman.eftapi.response.MasterTableResponse;

@Service
public class MasterService {
	
	@Autowired
	AppDevicePinRepository pinRepository;

	@Autowired
	AddressTypeRepository addressTypeRepository;
	@Autowired
	CountryRepository countyRepository;
	@Autowired
	DistrictRepository districtRepository;
	@Autowired
	EmploymentTypeRepository employmentTypeRepository;
	@Autowired
	GenderRepository genderRepository;
	@Autowired
	LacRepository lacRepository;
	@Autowired
	MaritalStatusRepository maritalStatusRepository;
	@Autowired
	OccupationRepository occupationRepository;
	@Autowired
	RelationRepository relationRepository;
	@Autowired
	ReligionRepository religionRepository;
	@Autowired
	RouteRepository routeRepository;
	@Autowired
	StateRepository stateRepository;
	@Autowired
	SuspectDocumentRepository suspectDocumentRepository;
	@Autowired
	VillageRepository villageRepository;
	@Autowired
	ThanaRepository thanaRepository;
	@Autowired
	AppMasterVersionRepository masterVersionRepository;
	
	//Master Version Table
	public ArrayList<AppMasterVersion> getMasterVersionTable() {
		return masterVersionRepository.findAll();
	}

	public MasterTableResponse getAllMasterData(String thanaCode) {

		MasterTableResponse masterTableResponse = new MasterTableResponse();
		try {
			masterTableResponse.setAddressTypeList(addressTypeRepository.findByIsActive("Y"));
			masterTableResponse.setCountryList(countyRepository.findByIsActive("Y"));
			masterTableResponse.setStateList(stateRepository.findByIsActive("Y"));
			masterTableResponse.setDistrictList(districtRepository.findByIsActive("Y"));
			masterTableResponse.setLacList(lacRepository.findByIsActive("Y"));
			masterTableResponse.setThanaList(thanaRepository.findByThanaCodeAndIsActive(thanaCode, "Y"));
			masterTableResponse.setVillageList(villageRepository.findByThana_ThanaCodeAndIsActive(thanaCode, "Y"));
			masterTableResponse.setEmployementTypeList(employmentTypeRepository.findByIsActive("Y"));
			masterTableResponse.setGenderList(genderRepository.findByIsActive("Y"));
			masterTableResponse.setMaritalStatusList(maritalStatusRepository.findByIsActive("Y"));
			masterTableResponse.setOccupationList(occupationRepository.findByIsActive("Y"));
			masterTableResponse.setRelationList(relationRepository.findByIsActive("Y"));
			masterTableResponse.setReligionList(religionRepository.findByIsActive("Y"));
			masterTableResponse.setRouteList(routeRepository.findByIsActive("Y"));
			masterTableResponse.setDocList(suspectDocumentRepository.findByIsActive("Y"));
		} catch (Exception e) {

		} finally {

		}
		return masterTableResponse;
	}
}
