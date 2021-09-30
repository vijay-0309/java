public class KfcDTO{

public KfcDTO(){
System.out.println("KfcDTO object is created");
}
private String location;
private String item;
private int orderNumber;
private int price;
private boolean isOpen;

public String getLocation(){
return location;
}
public void setLocation(String location){
this.location = location;
}

public String getItem(){
return item;
}
public void setItem(String item){
this.item=item;
}

public int getOrderNumber(){
return orderNumber;
}
public void setOrderNumber(int orderNumber){
this.orderNumber = orderNumber;
}

public int getPrice(){
return price;
}
public void setPrice(int price){
this.price = price;
}

public boolean getIsOpen(){
return isOpen;
}
public void setIsOpen(boolean isOpen){
this.isOpen= isOpen;
}


}