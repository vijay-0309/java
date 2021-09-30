public class PharmacyDTO{

public PharmacyDTO(){
System.out.println("Pharmacy Object is created");
}

private String name;
private int id;
private String location;
private int noOfWorkers;
private boolean isOpen;

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}

public int getId(){
return id;
}
public void setId(int id){
this.id=id;
}

public String getLocation(){
return location;
}
public void setLocation(String location){
this.location=location;
}

public int getNoOfWorkers(){
return noOfWorkers;
}
public void setNoOfWorkers(int noOfWorkers){
this.noOfWorkers=noOfWorkers;
}

public boolean getIsOpen(){
return isOpen;
}
public void setIsOpen(boolean isOpen){
this.isOpen=isOpen;
}

}