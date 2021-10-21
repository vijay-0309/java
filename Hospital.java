class Hospital{

public PatientDTO[] patients;

private int index;

public Hospital(int size){
patients=new PatientDTO[size];
}

public boolean createPatients(PatientDTO patients){

 boolean patientAdded=false;

System.out.println("inside createPatients method");

if(patients!=null){            //null check logic;
  this.patients[index++]=patients;
  patientAdded=true;
}
else{
 System.out.println("No Patient Added");
 return patientAdded=false;
}
return patientAdded;
}

public void getAllPatients(){
for(int i=0;i<patients.length;i++){
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


}