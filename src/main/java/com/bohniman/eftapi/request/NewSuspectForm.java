package com.bohniman.eftapi.request;

import java.util.ArrayList;

public class NewSuspectForm {

	private SuspectRequest suspect;
	private ArrayList<FamilyRequest> family;
	private ArrayList<AddressRequest> address;
	private byte[] photo;

	public NewSuspectForm() {
		super();
	}

	public SuspectRequest getSuspect() {
		return suspect;
	}

	public void setSuspect(SuspectRequest suspect) {
		this.suspect = suspect;
	}

	public ArrayList<FamilyRequest> getFamily() {
		return family;
	}

	public void setFamily(ArrayList<FamilyRequest> family) {
		this.family = family;
	}

	public ArrayList<AddressRequest> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<AddressRequest> address) {
		this.address = address;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

}
