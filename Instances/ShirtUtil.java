class ShirtUtil{

public static void main(String a[]){

Shirt shirt=new Shirt();
shirt.brandName="Ramraj";
shirt.size="L";
shirt.cost= 750;

Shirt.getShirt();
System.out.println(shirt.brandName+"\n"+shirt.size+"\n"+shirt.cost+"\n");

Shirt shirt1=new Shirt();
shirt1.brandName="Van Hussen";
shirt1.size="Xl";
shirt1.cost= 500;

Shirt.getShirt();
System.out.println(shirt1.brandName+"\n"+shirt1.size+"\n"+shirt1.cost+"\n");

Shirt shirt2=new Shirt();
shirt2.brandName="Peter England";
shirt2.size="XXl";
shirt2.cost= 1000;

Shirt.getShirt();
System.out.println(shirt2.brandName+"\n"+shirt2.size+"\n"+shirt2.cost+"\n");

}

}