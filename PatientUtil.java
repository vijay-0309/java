class PatientUtil{

public static void main(String a[]){


PatientDTO dto=new PatientDTO();
dto.setPatientId(316376804405);
dto.setPatientName("viji");
dto.setAge(22);
dto.setGender("Male");
dto.setAddress("Channagiri");
dto.setBloodGroup("B +ve");

System.out.println(dto.getPatientId()+" "+dto.getPatientName()+" "+dto.getAge()+" "+dto.getGender()+" "+dto.getAddress()+" "+dto.getBloodGroup());
}


}