class SweetUtil{

public static void main(String a[]){

Sweet obj=new Sweet();
obj.nameOfBakery="variar Bakery";
obj.nameOfSweet="Boost Burfy";
obj.costPerPiece=15;
obj.numberOfPieces=50;

System.out.println(obj.nameOfBakery+"\n"+obj.nameOfSweet+"\n"+obj.costPerPiece+"\n"+obj.numberOfPieces);

Sweet.getDetails();


Sweet obj1=new Sweet();
obj1.nameOfBakery="Venkateshwara Bakery";
obj1.nameOfSweet="Champakali";
obj1.costPerPiece=20;
obj1.numberOfPieces=100;

System.out.println(obj1.nameOfBakery+"\n"+obj1.nameOfSweet+"\n"+obj1.costPerPiece+"\n"+obj1.numberOfPieces);

Sweet.getDetails();

Sweet obj2=new Sweet();
obj2.nameOfBakery="Ayyangar Bakery";
obj2.nameOfSweet="Dharwad peda";
obj2.costPerPiece=10;
obj2.numberOfPieces=25;

System.out.println(obj2.nameOfBakery+"\n"+obj2.nameOfSweet+"\n"+obj2.costPerPiece+"\n"+obj2.numberOfPieces);

Sweet.getDetails();

}


}