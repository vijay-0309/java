class ChocolatesUtil{

public static void main(String a[]){

Chocolates prop = new Chocolates();
prop.brand="Cadbury";
prop.name="Dairymilk Fruit and Nut";
prop.price=140;
prop.quantityInGms=120;

System.out.println(prop.brand+"\n"+prop.name+"\n"+prop.price+"\n"+prop.quantityInGms+"\n");
Chocolates.getChocolate();

Chocolates prop1 = new Chocolates();
prop1.brand="Harshes";
prop1.name="Blueberry with almonds";
prop1.price=55;
prop1.quantityInGms=55;

System.out.println(prop1.brand+"\n"+prop1.name+"\n"+prop1.price+"\n"+prop1.quantityInGms+"\n");
Chocolates.getChocolate();

Chocolates prop2 = new Chocolates();
prop2.brand="Nestle";
prop2.name="munch";
prop2.price=10;
prop2.quantityInGms=18;

System.out.println(prop2.brand+"\n"+prop2.name+"\n"+prop2.price+"\n"+prop2.quantityInGms+"\n");
Chocolates.getChocolate();

}

}