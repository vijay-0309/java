class CurrencyTester{

public static void main(String a[]){

CurrencyDTO curr=new CurrencyDTO();
curr.setCountry("India");
curr.setCurrencyType("Rupees");
curr.setMaxValue(2000);
curr.setMinValue(1);

System.out.println(curr);
}
}