package com.xworkz.CollectionAndFrameworks.Dto;

public class GymDTO {
	private String gstId;
	private String location;
	public GymDTO(String gstId,String location) {
		this.gstId=gstId;
		this.location=location;
	}
	public String getGstId() {
		return gstId;
	}
	public void setGstId(String gstId) {
		this.gstId = gstId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "GymDTO [gstId=" + gstId + ", location=" + location + "]";
	}
	

}
