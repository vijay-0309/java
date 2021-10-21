public class ContinentDTO{

private int noOfContinents;
private String name;
private int noOfCountries;

public ContinentDTO(){
System.out.println(this.getClass().getSimpleName()+" object is created");
}

public int getNoOfContinents(){
return noOfContinents;
}
public void setNoOfContinents(int noOfContinents){
this.noOfContinents=noOfContinents;
}

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}

public int getNoOfCountries(){
return noOfCountries;
}
public void setNoOfCountries(int noOfCountries){
this.noOfCountries=noOfCountries;
}

@Override
public String toString(){
return "ContinentDTO-[NumberofContinents="+this.noOfContinents+", NameofContinent="+this.name+", NumberOfCountries="+this.noOfCountries+"]";
}
}