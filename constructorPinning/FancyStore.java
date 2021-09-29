class FancyStore{

String shopName;
String shopLocation;
int shopId;
String items[]={"Bangals","Books","Pens","Perfumes","Gifts","Jewellaries"};

public FancyStore(){
this("BangaloreFancyStore","Rajajinagar 1stBlock",1395);
System.out.println("FancyStore constructor is created");
}

public FancyStore(String shopName,String shopLocation,int shopId){
this.shopName=shopName;
this.shopLocation=shopLocation;
this.shopId=shopId;
}

public void displayShop(){
System.out.println(this.shopName+" "+this.shopLocation+" "+this.shopId);
}

public void getItems(){
for(int i=0;i<this.items.length;i++){
System.out.println(items[i]);
}
}
}