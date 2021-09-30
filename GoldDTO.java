public class GoldDTO{

public GoldDTO(){
System.out.println("GoldDTO object is created");
}

private String type;
private int price;
private String color;
private String karet;

public String getType(){
return type;
}
public void setType(String type){
this.type=type;
}


public int getPrice(){
return price;
}
public void setPrice(int price){
this.price=price;
}

public String getColor(){
return color;
}
public void setColor(String color){
this.color=color;
}

public String getKaret(){
return karet;
}
public void setKaret(String karet){
this.karet=karet;
}

}