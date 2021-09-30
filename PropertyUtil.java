class PropertyUtil{

public static void main(String a[]){

PropertyDTO prop=new PropertyDTO();
prop.setId("KA17CNG143");
prop.setOwnerName("Vijay");
prop.setPrice(320000);
prop.setAreainSqft("30 x 40");
prop.setLocation("Channagiri");

System.out.println(prop.getId()+" "+prop.getOwnerName()+" "+prop.getPrice()+" "+prop.getAreainSqft()+" "+prop.getLocation());
}


}