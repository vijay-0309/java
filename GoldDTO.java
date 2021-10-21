public class GoldDTO{

private String name;
private String noOfKarets;
private int price;

public GoldDTO(){
System.out.println(this.getClass().getSimpleName()+" object is created");
}

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}

public String getNoOfKarets(){
return noOfKarets;
}
public void setNoOfKarets(String noOfKarets){
this.noOfKarets=noOfKarets;
}

public int getPrice(){
return price;
}
public void setPrice(int price){
this.price=price;
}

@Override
public String toString(){
return "GoldDTO-[GoldType="+this.name+", GoldKarets="+this.noOfKarets+", GoldPrice="+this.price+"]";
}
}