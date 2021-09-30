class DrivingLicenseUtil{

public static void main(String a[]){

DrivingLicenseDTO dl = new DrivingLicenseDTO();
dl.setName("Vijay N M");
dl.setDlNo("KA44202100621");
dl.setAge(22);
dl.setIsExpired(true);

System.out.println(dl.getName()+ " "+dl.getDlNo()+ " "+dl.getAge()+ " "+dl.getIsExpired());
}
}