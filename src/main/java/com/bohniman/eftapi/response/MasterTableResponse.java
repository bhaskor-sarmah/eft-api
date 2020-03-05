package com.bohniman.eftapi.response;

import java.util.ArrayList;

import com.bohniman.eftapi.model.AppDevicePin;
import com.bohniman.eftapi.model.MasterAddressType;
import com.bohniman.eftapi.model.MasterCountry;
import com.bohniman.eftapi.model.MasterDistrict;
import com.bohniman.eftapi.model.MasterEmploymentType;
import com.bohniman.eftapi.model.MasterGender;
import com.bohniman.eftapi.model.MasterImmigrationRoute;
import com.bohniman.eftapi.model.MasterLac;
import com.bohniman.eftapi.model.MasterMaritalStatus;
import com.bohniman.eftapi.model.MasterOccupation;
import com.bohniman.eftapi.model.MasterRelation;
import com.bohniman.eftapi.model.MasterReligion;
import com.bohniman.eftapi.model.MasterState;
import com.bohniman.eftapi.model.MasterSuspectDocument;
import com.bohniman.eftapi.model.MasterThana;
import com.bohniman.eftapi.model.MasterVillage;

public class MasterTableResponse {

//	country,state,district,thana,lac,village, family relation, gender, m satus,occu, religion, doc type, emp type,  route,
	private ArrayList<AppDevicePin> pass;
	private ArrayList<MasterAddressType> addressTypeList;
	private ArrayList<MasterCountry> countryList;
	private ArrayList<MasterState> stateList;
	private ArrayList<MasterDistrict> districtList;
	private ArrayList<MasterThana> thanaList;
	private ArrayList<MasterLac> lacList;
	private ArrayList<MasterVillage> villageList;
	private ArrayList<MasterRelation> relationList;
	private ArrayList<MasterGender> genderList;
	private ArrayList<MasterMaritalStatus> maritalStatusList;
	private ArrayList<MasterOccupation> occupationList;
	private ArrayList<MasterReligion> religionList;
	private ArrayList<MasterSuspectDocument> docList;
	private ArrayList<MasterEmploymentType> employementTypeList;
	private ArrayList<MasterImmigrationRoute> routeList;

	public MasterTableResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<AppDevicePin> getPass() {
		return pass;
	}

	public void setPass(ArrayList<AppDevicePin> pass) {
		this.pass = pass;
	}

	public ArrayList<MasterAddressType> getAddressTypeList() {
		return addressTypeList;
	}

	public void setAddressTypeList(ArrayList<MasterAddressType> addressTypeList) {
		this.addressTypeList = addressTypeList;
	}

	public ArrayList<MasterCountry> getCountryList() {
		return countryList;
	}

	public void setCountryList(ArrayList<MasterCountry> countryList) {
		this.countryList = countryList;
	}

	public ArrayList<MasterState> getStateList() {
		return stateList;
	}

	public void setStateList(ArrayList<MasterState> stateList) {
		this.stateList = stateList;
	}

	public ArrayList<MasterDistrict> getDistrictList() {
		return districtList;
	}

	public void setDistrictList(ArrayList<MasterDistrict> districtList) {
		this.districtList = districtList;
	}

	public ArrayList<MasterThana> getThanaList() {
		return thanaList;
	}

	public void setThanaList(ArrayList<MasterThana> thanaList) {
		this.thanaList = thanaList;
	}

	public ArrayList<MasterLac> getLacList() {
		return lacList;
	}

	public void setLacList(ArrayList<MasterLac> lacList) {
		this.lacList = lacList;
	}

	public ArrayList<MasterVillage> getVillageList() {
		return villageList;
	}

	public void setVillageList(ArrayList<MasterVillage> villageList) {
		this.villageList = villageList;
	}

	public ArrayList<MasterRelation> getRelationList() {
		return relationList;
	}

	public void setRelationList(ArrayList<MasterRelation> relationList) {
		this.relationList = relationList;
	}

	public ArrayList<MasterGender> getGenderList() {
		return genderList;
	}

	public void setGenderList(ArrayList<MasterGender> genderList) {
		this.genderList = genderList;
	}

	public ArrayList<MasterMaritalStatus> getMaritalStatusList() {
		return maritalStatusList;
	}

	public void setMaritalStatusList(ArrayList<MasterMaritalStatus> maritalStatusList) {
		this.maritalStatusList = maritalStatusList;
	}

	public ArrayList<MasterOccupation> getOccupationList() {
		return occupationList;
	}

	public void setOccupationList(ArrayList<MasterOccupation> occupationList) {
		this.occupationList = occupationList;
	}

	public ArrayList<MasterReligion> getReligionList() {
		return religionList;
	}

	public void setReligionList(ArrayList<MasterReligion> religionList) {
		this.religionList = religionList;
	}

	public ArrayList<MasterSuspectDocument> getDocList() {
		return docList;
	}

	public void setDocList(ArrayList<MasterSuspectDocument> docList) {
		this.docList = docList;
	}

	public ArrayList<MasterEmploymentType> getEmployementTypeList() {
		return employementTypeList;
	}

	public void setEmployementTypeList(ArrayList<MasterEmploymentType> employementTypeList) {
		this.employementTypeList = employementTypeList;
	}

	public ArrayList<MasterImmigrationRoute> getRouteList() {
		return routeList;
	}

	public void setRouteList(ArrayList<MasterImmigrationRoute> routeList) {
		this.routeList = routeList;
	}

}
