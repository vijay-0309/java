package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.dto.*;

public class Hospital {

	public PatientDTO[] patients;

	private int index;
	public static int s = 0;

	public Hospital(int size) {
		patients = new PatientDTO[size];
	}

	public boolean createPatients(PatientDTO patients) {

		boolean patientAdded = false;

		System.out.println("inside createPatients method");

		if (patients != null) { // null check logic;
			this.patients[index++] = patients;
			patientAdded = true;
		} else {
			System.out.println("No Patient Added");
			return patientAdded = false;
		}
		return patientAdded;
	}




public void getAllPatients(){
for(int i=0;i<patients.length-s;i++){
System.out.println(patients[i]);
}
}

// method to find details of patient by name:
public PatientDTO getPatientByName(String patientName){
PatientDTO patientDTO=null;
System.out.println("Inside the getPatientByName()");

 if(patientName!=null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getPatientName().equals(patientName)){
      System.out.println("Patient found by Name: "+patientName);
      patientDTO=patients[i];
     }
   }
 }
 else{
      System.out.println("No records found");
     }
 return patientDTO;
}

//method to find details of patient by id:
public PatientDTO getPatientById(int patientId){
PatientDTO patientDTO=null;
System.out.println("Inside the getPatientById()");

 if(patientId!=0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getPatientId() == patientId){
      System.out.println("Patient found by Id: "+patientId);
      patientDTO=patients[i];
     }
   }
 }
 else{
      System.out.println("No records found");
     }
 return patientDTO;
}

//method to find details of patient by contact No:
public PatientDTO getPatientByContactNo(long contactNo){
PatientDTO patientDTO=null;
System.out.println("Inside the getPatientByContactNo()");

 if(contactNo!=0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getContactNo() == contactNo){
      System.out.println("Patient found by Contact Num: "+contactNo);
      patientDTO=patients[i];
     }
   }
 }
 else{
      System.out.println("No records found");
     }
 return patientDTO;
}

//method to find details of patient by Address:
public PatientDTO getPatientByAddress(String address){
PatientDTO patientDTO=null;
System.out.println("Inside the getPatientByAddress()");

 if(address!=null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAddress().equals(address)){
      System.out.println("Patient found by Address: "+address);
      patientDTO=patients[i];
     }
   }
 }
 else{
      System.out.println("No records found");
     }
 return patientDTO;
}

//method to find details of patient by Blood Group:
public PatientDTO getPatientByBloodGroup(String bloodGroup){
PatientDTO patientDTO=null;
System.out.println("Inside the getPatientByBloodGroup()");

 if(bloodGroup!=null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getBloodGroup().equals(bloodGroup)){
      System.out.println("Patient found by Blood Group: "+bloodGroup);
      patientDTO=patients[i];
     }
   }
 }
 else{
      System.out.println("No records found");
     }
 return patientDTO;
}

//method to find details of patient by Age:
public PatientDTO getPatientByAge(int age){
PatientDTO patientDTO=null;
System.out.println("Inside the getPatientByAge()");

 if(age!=0){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getAge()==age){
      System.out.println("Patient found by Age: "+age);
      patientDTO=patients[i];
     }
   }
 }
 else{
      System.out.println("No records found");
     }
 return patientDTO;
}

//method to find details of patient by Gender:
public PatientDTO getPatientByGender(String gender){
PatientDTO patientDTO=null;
System.out.println("Inside the getPatientByGender()");

 if(gender!=null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getGender().equals(gender)){
      System.out.println("Patient found by Gender: "+gender);
      patientDTO=patients[i];
     }
   }
 }
 else{
      System.out.println("No records found");
     }
 return patientDTO;
}

//get patient by streetname;
public boolean getPatientByStreetName(String streetName) {
	boolean f=false;
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientByStreetName()");
	if(streetName!=null) {
		for(int i=0;i<patients.length;i++) {
			if(patients[i].getAddress().getCountryDto().getStateDto().getDistrictDto().getAreaDto().getStreetDto().getStreetName().equals(streetName)) {
				System.out.println("patient found by streetname: "+streetName);
				patientDTO=patients[i];
				f=true;
				break;
			}
			else {
				f=false;
			}
		}
	}
	if(f==false) {
		System.out.println("no patient found by street name");
	}
	return f;
	
}

//get patient by stateName:
public boolean getPatientByStateName(String stateName) {
	boolean f=false;
	PatientDTO patientDTO=null;
	System.out.println("inside getPatient by State name");
	if(stateName!=null) {
		for(int i=0;i<patients.length;i++) {
			if(patients[i].getAddress().getCountryDto().getStateDto().getStateName().equals(stateName)) {
				System.out.println("patient found by stateName:"+stateName);
				patientDTO=patients[i];
				f=true;
				break;
			}
			else {
				f=false;
			}
		}
	}
	if(f==false) {
		System.out.println("no patient found by state name");
	}
	return f;
}

//getpatient by area Name:
public boolean getPatientByAreaName(String areaName) {
	boolean f=false;
	PatientDTO patientDto=null;
	System.out.println("inside getPatientByAreaName()");
	if(areaName!=null) {
		for(int i=0;i<patients.length;i++) {
			if(patients[i].getAddress().getCountryDto().getStateDto().getDistrictDto().getAreaDto().getAreaName().equals(areaName)) {
				System.out.println("patient found by area name:"+areaName);
				patientDto=patients[i];
			    f=true;
			    break;
			}
			else {
				f=false;
			}
		}
	}
	if(f==false) {
		System.out.println("no patient found by area name");
	}
	return f;
}

//get patients by street number:
public boolean getPatientByStreetNumber(int streetNo) {
	boolean f=false;
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientByStreet number()");
	if(streetNo!=0) {
		for(int i=0;i<patients.length;i++) {
			if(patients[i].getAddress().getCountryDto().getStateDto().getDistrictDto().getAreaDto().getStreetDto().getStreetNo()==streetNo) {
				System.out.println("patient found by street number: "+streetNo);
				patientDTO=patients[i];
				f=true;
				break;
			}
			else {
				f=false;
			}
		}
	}
	if(f==false) {
		System.out.println("no patient found by street number");
	}
	return f;
}

//Update:
//to update the mobile number by patient id:
public boolean updatePatientContactNoById(int patientId,long contactNo){
System.out.println("Inside the updatePatientContactNoById()");
boolean update=false;
PatientDTO patientDTO=null;
 if(patientId>0 && contactNo>0){
  for(int i=0;i<patients.length;i++){
    if(patients[i].getPatientId() == patientId){
      System.out.println("Patient found by patientId: "+patientId);
      patients[i].setContactNo(contactNo);
      update=true;
     }
   }
}
else{
System.out.println("No Update Found");
}
return update;
}

//Delete:
//Delete patient details by patient Id:
public boolean deletePatientDetailsByPatientId(int patientId){
boolean delete=false;
int id=0;
PatientDTO patientDTO=null;
System.out.println("inside deletPatientDetailsByPatientId() ");
if(patientId>0){
 for(int i=0;i<patients.length;i++){
  if(patients[i].getPatientId() == (patientId)){
    System.out.println("Patient deleted by id: "+ patientId);
    id=i;
    s=s+1;
    delete=true;
    break;
   }
  else{
     delete=false;
     }
  }
 if(id>=0){
  for(int i=id;i<patients.length-1;i++){
     patients[i]=patients[i+1];
    }
 }
}
if(delete==false){
System.out.println("No patients deleted");
}
return delete;
}

}