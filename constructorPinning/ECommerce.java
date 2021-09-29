class ECommerce{

String name;
int id;
String productName;
int price;
String platforms[]={"FlipKart","Amazon","Myntra","AJio","JioMart"};


public ECommerce(){
this("ECom Express",143,"JeanseShirt",1400);
System.out.println("ECommerce constructor is created");
}

public ECommerce(String name,int id,String productName,int price){
this.name=name;
this.id=id;
this.productName=productName;
this.price=price;
}

public void displayDetails(){
System.out.println(this.name+" "+this.id+" "+this.productName+" "+this.price);
}

public void getPlatforms(){
for(int i=0;i<this.platforms.length;i++){
System.out.println(platforms[i]);
}
}

}