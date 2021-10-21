import java.util.*;  		 // or import java.util.Scanner;   *=include all;
class HospitalTester{

public static void main(String a[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of patients:");
int size=sc.nextInt();

Hospital hospital=new Hospital(size);

for(int i=0;i<size;i++){

PatientDTO dto=new PatientDTO();
System.out.println("enter patient id:");
int patientId=sc.nextInt();
dto.setPatientId(patientId);

System.out.println("enter patient name:");
String patientName=sc.next();
dto.setPatientName(patientName);

System.out.println("enter patient address:");
String address=sc.next();
dto.setAddress(address);

System.out.println("enter patient age:");
int age=sc.nextInt();
dto.setAge(age);

System.out.println("enter patient Gender:");
String gender=sc.next();
dto.setGender(gender);

System.out.println("enter patient bloodGroup:");
String bloodGroup=sc.next();
dto.setBloodGroup(bloodGroup);

System.out.println("enter patient Contact number:");
long contactNo=sc.nextLong();
dto.setContactNo(contactNo);


//PatientDTO dto1=new PatientDTO();
//dto1.setPatientId(002);
//dto1.setPatientName("manisha");
//dto1.setAddress("Basaveshnagar");
//dto1.setAge(21);
//dto1.setGender("Female");
//dto1.setBloodGroup("o-ve");
//dto1.setContactNo(9743776158l);

boolean isAdded=hospital.createPatients(dto);
System.out.println(isAdded);
//boolean isAdded1=hospital.createPatients(dto1);
//System.out.println(isAdded1);
}
//hospital.getAllPatients();      this is used to print all the patients details();

System.out.println("enter the patient name to fetch details:");
String name=sc.next();
System.out.println(hospital.getPatientByName(name));

System.out.println("enter the patient id to fetch details:");
int id=sc.nextInt();
System.out.println(hospital.getPatientById(id));

System.out.println("enter the patient Contact Num to fetch details:");
long phno=sc.nextLong();
System.out.println(hospital.getPatientByContactNo(phno));

System.out.println("enter the patient Address to fetch details:");
String add=sc.next();
System.out.println(hospital.getPatientByAddress(add));

System.out.println("enter the patient BloodGroup to fetch details:");
String bg=sc.next();
System.out.println(hospital.getPatientByBloodGroup(bg));

System.out.println("enter the patient Age to fetch details:");
int ag=sc.nextInt();
System.out.println(hospital.getPatientByAge(ag));

System.out.println("enter the patient Gender to fetch details:");
String gen=sc.next();
System.out.println(hospital.getPatientByGender(gen));

}

}