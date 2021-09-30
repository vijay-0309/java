class SwiggyUtil{

public static void main(String a[]){

SwiggyDTO swiggy = new SwiggyDTO();
swiggy.setHotelName("Annapurneshwari-hotel");
swiggy.setType("vegitarian");
swiggy.setFoodName("veg-Biriyani");
swiggy.setMobileNo(6361237903l);
swiggy.setIsOpen(true);

System.out.println(swiggy.getHotelName()+ " "+swiggy.getType()+ " "+swiggy.getFoodName()+" "+swiggy.getMobileNo()+ " "+swiggy.getIsOpen());
}
}