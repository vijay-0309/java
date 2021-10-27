package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.dto.*;

import java.util.*; // or import java.util.Scanner;   *=include all;

public class HospitalTester {

public static void main(String a[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of patients:");
int size=sc.nextInt();

Hospital hospital=new Hospital(size);

for(int i=0;i<size;i++){

PatientDTO dto=new PatientDTO();
System.out.println("enter patient id:");
dto.setPatientId(sc.nextInt());

System.out.println("enter patient name:");
dto.setPatientName(sc.next());


System.out.println("enter patient age:");
dto.setAge(sc.nextInt());

System.out.println("enter patient Gender:");
dto.setGender(sc.next());

System.out.println("enter patient bloodGroup:");
dto.setBloodGroup(sc.next());

System.out.println("enter patient Contact number:");
dto.setContactNo(sc.nextLong());

AddressDTO address=new AddressDTO();
System.out.println("enter the addressId and addressName:");
address.setAddressId(sc.nextInt());
address.setAddressName(sc.next());

CountryDTO country=new CountryDTO();
System.out.println("enter the countryId and countryName:");
country.setCountryId(sc.nextInt());
country.setCountryName(sc.next());

StateDTO state=new StateDTO();
System.out.println("enter the stateId and stateName");
state.setStateId(sc.nextInt());
state.setStateName(sc.next());

DistrictDTO district=new DistrictDTO();
System.out.println("enter districtId and districtName");
district.setDistrictId(sc.nextInt());
district.setDistrictName(sc.next());

AreaDTO area=new AreaDTO();
System.out.println("enter the areaId and areaName");
area.setAreaId(sc.nextInt());
area.setAreaName(sc.next());

StreetDTO street=new StreetDTO();
System.out.println("enter streetId , streetName and streetNo");
street.setStreetId(sc.nextInt());
street.setStreetName(sc.next());
street.setStreetNo(sc.nextInt());

dto.setAddress(address);
address.setCountryDto(country);
country.setStateDto(state);
state.setDistrictDto(district);
district.setAreaDto(area);
area.setStreetDto(street);


boolean isAdded=hospital.createPatients(dto);
System.out.println(isAdded);
}
int choice;
String text;
do
	{
		System.out.println("press 1 to get all patients");
		System.out.println("press 2 to get patient by id");
		System.out.println("press 3 to get patient by name");
		System.out.println("press 4 to get patient by contact number");
		System.out.println("press 5 to get patient by blood group");
		System.out.println("press 6 to get patient by age");
		System.out.println("press 7 to get patient by gender");
		System.out.println("press 8 to update contact number by id");
		System.out.println("press 9 to delete patient by id");
		System.out.println("press 10 to get patient by street name");
		System.out.println("press 11 to get patient by state name");
		System.out.println("press 12 to get patient by area name");
		System.out.println("press 13 to get patient by street number");
		System.out.println("enter your choice:");

		choice=sc.nextInt();
		
		switch(choice) {
		case 1: hospital.getAllPatients();
		break;
		case 2: 
			System.out.println("enter the id");
			PatientDTO dto1=hospital.getPatientById(sc.nextInt());
			if(dto1!=null){
				System.out.println(dto1);
			}
			else {
				System.out.println("no patient found by id");
			}
			break;
		case 3:
			System.out.println("enter the patient name:");
			PatientDTO dto2=hospital.getPatientByName(sc.next());
			if(dto2!=null) {
				System.out.println(dto2);
			}
			else {
				System.out.println("No patient found by name");
			}
			break;
		case 4:
			System.out.println("enter contact number:");
			PatientDTO contact=hospital.getPatientByContactNo(sc.nextLong());
			if(contact!=null) {
				System.out.println(contact);
			}
			else {
				System.out.println("No patient found by contact number");
			}
			break;
		case 5:
			System.out.println("enter blood group");
			PatientDTO bldgrp=hospital.getPatientByBloodGroup(sc.next());
			if(bldgrp!=null) {
				System.out.println(bldgrp);
			}
			else {
				System.out.println("No Patient found by blood group");
			}
			break;
		case 6:
			System.out.println("enter age");
			PatientDTO ag=hospital.getPatientByAge(sc.nextInt());
			if(ag!=null) {
				System.out.println(ag);
			}
			else {
				System.out.println("No patient found by age");
			}
			break;
		case 7:
			System.out.println("enter gender");
			PatientDTO gen=hospital.getPatientByGender(sc.next());
			if(gen!=null) {
				System.out.println(gen);
			}
			else {
				System.out.println("No patient found by gender");
			}
			break;
		case 8:
			System.out.println("enter patient id and contact number to update");
			boolean update=hospital.updatePatientContactNoById(sc.nextInt(), sc.nextLong());
			if(update!=false) {
				System.out.println(update);
				hospital.getAllPatients();
			}
			else {
				System.out.println("No contact number updated");
			}
			break;
		case 9:
			System.out.println("enter patient id to delete");
			boolean delet=hospital.deletePatientDetailsByPatientId(sc.nextInt());
			if(delet!=false) {
				System.out.println(delet);
				hospital.getAllPatients();
			}
			else {
				System.out.println("No patients deleted");
			}
			break;
		case 10:
			System.out.println("enter street name to fetch patient");
			boolean str=hospital.getPatientByStateName(sc.next());
			if(str!=false) {
				System.out.println(str);
				hospital.getAllPatients();
			}
			else {
				System.out.println("No patient found by street name");
			}
			break;
		case 11:
			System.out.println("enter state name to find patients ");
			boolean st=hospital.getPatientByStateName(sc.next());
			if(st!=false) {
				System.out.println(st);
				hospital.getAllPatients();
			}
			else {
				System.out.println("no patients found by state name");
			}
			break;
		case 12:
			System.out.println("enter area name to fetch patient");
			boolean ar=hospital.getPatientByAreaName(sc.next());
			if(ar!=false) {
				System.out.println(ar);
				hospital.getAllPatients();
			}
			else {
				System.out.println("no patient found by area name");
			}
			break;
		case 13:
			System.out.println("enter street no to fetch details");
			boolean  stret=hospital.getPatientByStreetNumber(sc.nextInt());
			if(stret!=false) {
				System.out.println(stret);
				hospital.getAllPatients();
			}
			else {
				System.out.println("No patient found by street no");
			}
			break;
		default:
		    System.out.println("please provide valid choice....");
		    break;
	}
		System.out.println("do you want to continue or not???press y or n");
	    text=sc.next();
		}while(text.equals("y")); 
		System.out.println("thank you for using our application");







}
}
