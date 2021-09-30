public class SwiggyDTO{
 
public SwiggyDTO(){
System.out.println("SwiggyDTO object is created");
}
 
private String hotelName;
private String type;
private String foodName;
private long mobileNo;
private boolean isOpen;

public String getHotelName(){
return hotelName;
}
public void setHotelName(String hotelName){
this.hotelName = hotelName;
}


public String getType(){
return type;
}
public void setType(String type){
this.type = type;
}


public String getFoodName(){
return foodName;
}
public void setFoodName(String foodName){
this.foodName = foodName;
}

public long getMobileNo(){
return mobileNo;
}
public void setMobileNo(long mobileNO){
this.mobileNo=mobileNo;
}


public boolean getIsOpen(){
return isOpen;
}
public void setIsOpen(boolean isOpen){
this.isOpen =isOpen;
}
 
}