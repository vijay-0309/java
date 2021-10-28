package com.xworkz.googleapp.dto;

public class GoogleApplicationsDTO {
	private String name;
	private int sizeInMb;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSizeInMb() {
		return sizeInMb;
	}
	public void setSizeInMb(int sizeInMb) {
		this.sizeInMb = sizeInMb;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "GoogleApplicationsDTO [name=" + name + ", sizeInMb=" + sizeInMb + ", type=" + type + "]";
	}
	
	

}
