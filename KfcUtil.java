class KfcUtil{

public static void main(String a[]){

KfcDTO kfc = new KfcDTO();
kfc.setLocation("Mantri-Mall");
kfc.setItem("Hot-Wings-with-coke");
kfc.setOrderNumber(23);
kfc.setPrice(999);
kfc.setIsOpen(true);

System.out.println(kfc.getLocation()+ " "+kfc.getItem()+" "+kfc.getOrderNumber()+ " "+kfc.getPrice()+ " "+kfc.getIsOpen());
}
}