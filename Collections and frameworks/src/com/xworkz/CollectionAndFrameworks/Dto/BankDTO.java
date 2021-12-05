package com.xworkz.CollectionAndFrameworks.Dto;

public class BankDTO {
	private String name;
	private String location;
	
	public BankDTO(String name,String location) {
		this.name=name;
		this.location=location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "BankDTO [name=" + name + ", location=" + location + "]";
	}
	
}
