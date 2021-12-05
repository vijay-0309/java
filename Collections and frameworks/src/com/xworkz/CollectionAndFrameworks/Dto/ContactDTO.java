package com.xworkz.CollectionAndFrameworks.Dto;

public class ContactDTO {
	private String name;
	private long contactNo;
	public ContactDTO(String name,long contactNo) {
		this.name=name;
		this.contactNo=contactNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "ContactDTO [name=" + name + ", contactNo=" + contactNo + "]";
	}
	

}
