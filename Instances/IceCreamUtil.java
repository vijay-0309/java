class IceCreamUtil{

public static void main(String a[]){

IceCream ice=new IceCream();
ice.nameOfIcecream="Butterscotch iceCream";
ice.cost=50;

IceCream.getIceCream();
System.out.println(ice.nameOfIcecream+"\n"+ice.cost+"\n");


IceCream ice1=new IceCream();
ice1.nameOfIcecream="Gud-bud Icecream";
ice1.cost=80;

IceCream.getIceCream();
System.out.println(ice1.nameOfIcecream+"\n"+ice1.cost+"\n");


IceCream ice2=new IceCream();
ice2.nameOfIcecream="Vanilla Icecream";
ice2.cost=30;

IceCream.getIceCream();
System.out.println(ice2.nameOfIcecream+"\n"+ice2.cost+"\n");

}

}