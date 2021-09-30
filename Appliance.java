class Appliance{

public String name;
public String location;
public boolean isOpen;
public String type[]={"Home Appliance","Electronic Appliance","cooking Appliance"};

public Appliance(){
this("Panasonic-Sales-and-Services","Rajajinagar",true);
System.out.println("Appliance constructor created");
}

public Appliance(String name,String location,boolean isOPen){
this.name=name;
this.location=location;
this.isOpen=isOpen;
}

public void displayDetails(){
System.out.println(this.name+" "+this.location+" "+this.isOpen);
}

public void getDetails(){
for(int i=0;i<this.type.length;i++){
System.out.println(type[i]);
}
}

}