package com.xworkz.CollectionAndFrameworks.Dto;

public class MedicalShopDTO {
	private String shopName;
	private String location;
	private long contactNo;
	public MedicalShopDTO(String shopName,String location,long contactNo) {
		this.shopName=shopName;
		this.location=location;
		this.contactNo=contactNo;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "MedicalShopDTO [MedicalShopName=" + shopName + ", location=" + location + ", contactNo=" + contactNo + "]";
	}
	
}
