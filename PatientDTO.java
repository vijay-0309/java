class PatientDTO{

public PatientDTO(){
System.out.println(this.getClass().getSimpleName()+" object is created");
}

private int patientId;
private String patientName;
private long contactNo;
private String address;
private String bloodGroup;
private int age;
private String gender;

public int getPatientId(){
return patientId;
}
public void setPatientId(int patientId){
this.patientId=patientId;
}

public String getPatientName(){
return patientName;
}
public void setPatientName(String patientName){
this.patientName=patientName;
}

public long getContactNo(){
return contactNo;
}
public void setContactNo(long contactNo){
this.contactNo=contactNo;
}

public String getAddress(){
return address;
}
public void setAddress(String address){
this.address=address;
}

public String getBloodGroup(){
return bloodGroup;
}
public void setBloodGroup(String bloodGroup){
this.bloodGroup=bloodGroup;
}

public int getAge(){
return age;
}
public void setAge(int age){
this.age=age;
}

public String getGender(){
return gender;
}
public void setGender(String gender){
this.gender=gender;
}

@Override
public String toString(){
return "PatientDTO----[PatientId="+this.patientId+", PatientName="+this.patientName+", ContactNumber="+this.contactNo+", Address="+this.address+", BloodGroup="+this.bloodGroup+", PatientAge="+this.age+", Gender="+this.gender+"]";
}
}