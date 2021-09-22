class BagsUtil{

public static void main(String a[]){

Bags bag=new Bags();
bag.brand="Skybags";
bag.type="Tourist bag";
bag.cost=1500;

Bags.getBags();
System.out.println(bag.brand+"\n"+bag.type+"\n"+bag.cost+"\n");

Bags bag1=new Bags();
bag1.brand="Puma";
bag1.type="Collage Bag";
bag1.cost=1200;

Bags.getBags();
System.out.println(bag1.brand+"\n"+bag1.type+"\n"+bag1.cost+"\n");

Bags bag2=new Bags();
bag2.brand="WildCraft";
bag2.type="Trecking Bag";
bag2.cost=2500;

Bags.getBags();
System.out.println(bag2.brand+"\n"+bag2.type+"\n"+bag2.cost+"\n");

}



}