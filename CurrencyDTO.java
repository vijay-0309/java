public class CurrencyDTO{

private String country;
private String currencyType;
private int maxValue;
private int minValue;

public CurrencyDTO(){
System.out.println(this.getClass().getSimpleName()+" object is created");
}

public String getCountry(){
return country;
}
public void setCountry(String country){
this.country=country;
}

public String getCurrencyType(){
return currencyType;
}
public void setCurrencyType(String currencyType){
this.currencyType=currencyType;
}

public int getMaxValue(){
return maxValue;
}
public void setMaxValue(int maxValue){
this.maxValue=maxValue;
}

public int getMinValue(){
return minValue;
}
public void setMinValue(int minValue){
this.minValue=minValue;
}

@Override
public String toString(){
return "CurrencyDTO-[Country="+this.country+", CurrencyType="+this.currencyType+", MaximumCurrency="+this.maxValue+", MinimumCurrency="+this.minValue+"]";
}
}