public class PropertyDTO{

public PropertyDTO(){
System.out.println("PropertyDTO object is created");
}

private String id;
private String ownerName;
private int price;
private String areainSqft;
private String location;

public String getId(){
return id;
}
public void setId(String id){
this.id=id;
}


public String getOwnerName(){
return ownerName;
}
public void setOwnerName(String ownerName){
this.ownerName=ownerName;
}

public int getPrice(){
return price;
}
public void setPrice(int price){
this.price=price;
}

public String getAreainSqft(){
return areainSqft;
}
public void setAreainSqft(String areainSqft){
this.areainSqft=areainSqft;
}

public String getLocation(){
return location;
}
public void setLocation(String location){
this.location=location;
}
}