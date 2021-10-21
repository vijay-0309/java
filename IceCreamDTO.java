public class IceCreamDTO{

private String shopName;
private String iceName;
private int price;

public IceCreamDTO(){
System.out.println(this.getClass().getSimpleName()+" object is created");
}

public String getShopName(){
return shopName;
}
public void setShopName(String shopName){
this.shopName=shopName;
}

public String getIceName(){
return iceName;
}
public void setIceName(String iceName){
this.iceName=iceName;
}

public int getPrice(){
return price;
}
public void setPrice(int price){
this.price=price;
}

@Override
public String toString(){
return "IceCreamDTO-[Shop Name="+this.shopName+", IceCream="+this.iceName+", Price="+this.price+"]";
}
}