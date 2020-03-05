package com.bohniman.eftapi.request;

import java.util.ArrayList;

import com.bohniman.eftapi.model.AppMasterVersion;

public class MasterVersionForm {

	private ArrayList<AppMasterVersion> masterVersionList;

	public MasterVersionForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<AppMasterVersion> getMasterVersionList() {
		return masterVersionList;
	}

	public void setMasterVersionList(ArrayList<AppMasterVersion> masterVersionList) {
		this.masterVersionList = masterVersionList;
	}

}
