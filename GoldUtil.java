class GoldUtil{

public static void main(String a[]){

GoldDTO gold=new GoldDTO();
gold.setType("Yellow Gold");
gold.setPrice(47620);
gold.setColor("yellow");
gold.setKaret("24k");

System.out.println(gold.getType()+" "+gold.getPrice()+" "+gold.getColor()+" "+gold.getKaret());
}


}