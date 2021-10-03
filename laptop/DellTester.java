class DellTester{

public static void main(String a[]){

 Dell dell=new Dell();
 dell.price=35000;
 dell.modelNumber="bqtvj34143";
 dell.storage="2TB";
 dell.processor="Intel i5";

 HP hp=new HP();
 hp.price=45000;
 hp.modelNumber="mjctn1493";
 hp.storage="1.5TB";
 hp.processor="Intel i3";

 String store=dell.store();
 System.out.println(store);

 dell.displayDetails();
 hp.displayDetails();
 
}



}