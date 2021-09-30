public class DrivingLicenseDTO{

public DrivingLicenseDTO(){
System.out.println("DrivingLicenseDTO object is created");
}

private String name;
private String dlNo;
private int age;
private boolean isExpired;

public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}
public String getDlNo(){
return dlNo;
}
public void setDlNo(String dlNo){
this.dlNo = dlNo;
}
public int getAge(){
return age;
}
public void setAge(int age){
this.age = age;
}
public boolean getIsExpired(){
return isExpired;
}
public void setIsExpired(boolean isExpired){
this.isExpired = isExpired;
}
}