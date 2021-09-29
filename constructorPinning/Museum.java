class Museum{

String name;
String location;
String id;
int estYear;
String dept[]={"Acheology","Biology","History","Natural Science","Science and technology"};


public Museum(){
this("Vishweshwaraih Museum","Bangalore","KA01MU014",1999);
System.out.println("Museum constructor is created");
}

public Museum(String name,String location,String id,int estYear){
this.name=name;
this.location=location;
this.id=id;
this.estYear=estYear;
}

public void displayDetails(){
System.out.println(this.name+" "+this.location+" "+this.id+" "+this.estYear);
}

public void getDetails(){
for(int i=0;i<this.dept.length;i++){
System.out.println(dept[i]);
}
}
}