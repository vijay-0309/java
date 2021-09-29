class Transportation{

public String name;
public String startingPlace;
public String destination;
public int noOfDays;
public String mode[]={"Road","Water","Air","Railways"};


public Transportation(){
this("VRL Transport","Bangalore","Channagiri",3);
System.out.println("Transportation constructor is created");
}

public Transportation(String name,String startingPlace,String destination,int noOfDays){
this.name=name;
this.startingPlace=startingPlace;
this.destination=destination;
this.noOfDays=noOfDays;
}

public void displayResults(){
System.out.println(this.name+" "+this.startingPlace+" "+this.destination+" "+this.noOfDays);
}

public void getDetails(){
for(int i=0;i<this.mode.length;i++){
System.out.println(mode[i]);
}
}

}