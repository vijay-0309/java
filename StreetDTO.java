package com.xworkz.hospitalapp.dto;

public class StreetDTO {
	private int streetId;
	private String StreetName;
	private int streetNo;

	public int getStreetId() {
		return streetId;
	}

	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	@Override
	public String toString() {
		return "StreetDTO [streetId=" + streetId + ", StreetName=" + StreetName + ", streetNo=" + streetNo + "]";
	}

	

}
