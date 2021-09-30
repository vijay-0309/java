class Metro{

String name;
String metroId;
int noOfPassengers;
boolean isRunning;
String stop[]={"Majestic","MantriSquare","Srirampura","KuvempuRoad","Rajajinagar","Mahalakshmi","SandalSoapFactory","Yashwantpura"};

public Metro(){
this("NammaMetro","KA01ME001",50,true);
System.out.println("Metro Constructor Created");
}


public Metro(String name,String metroId,int noOfPassengers,boolean isRunning){
this.name=name;
this.metroId=metroId;
this.noOfPassengers=noOfPassengers;
this.isRunning=isRunning;
}


public void displayMetro(){
System.out.println(this.name+" "+this.metroId+" "+this.noOfPassengers+" "+this.isRunning);
}

public void getMetro(){
for(int i=0;i<this.stop.length;i++){
System.out.println(stop[i]);
}
}

}