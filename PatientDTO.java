public class PatientDTO{ 	//DTO-Data transfer object
 
public PatientDTO(){
System.out.println("PatientDTO object is created");
}

private long patientId;
private String patientName;
private int age;
private String gender;
private String address;
private String bloodGroup;

public long getPatientId(){      //getter method declaration and is to return the values,the return type in general is depends on type of data that we taken.
 return this.patientId;
}
public void setPatientId(long patientId){       //setter method declaration and is to initialize the value for variables,the return type in general is void.
 this.patientId=patientId;
}



public String getPatientName(){      
 return this.patientName;
}
public void setPatientName(String patientName){      
 this.patientName=patientName;
}



public int getAge(){      
 return this.age;
}
public void setAge(int age){      
 this.age=age;
}


public String getGender(){      
 return this.gender;
}
public void setGender(String gender){      
 this.gender=gender;
}


public String getAddress(){      
 return this.address;
}
public void setAddress(String address){      
 this.address=address;
}



public String getBloodGroup(){      
 return this.bloodGroup;
}
public void setBloodGroup(String bloodGroup){      
 this.bloodGroup=bloodGroup;
}

}