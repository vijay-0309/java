class PharmacyUtil{

public static void main(String a[]){


PharmacyDTO med=new PharmacyDTO();
med.setName("Apolo-Pharmacy");
med.setId(1043);
med.setLocation("GandhiBazar");
med.setNoOfWorkers(15);
med.setIsOpen(true);

System.out.println(med.getName()+" "+med.getId()+" "+med.getLocation()+" "+med.getNoOfWorkers()+" "+med.getIsOpen());

}

}