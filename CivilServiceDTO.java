public class CivilServiceDTO{

private String type;
private String service;
private int id;

public CivilServiceDTO(){
System.out.println(this.getClass().getSimpleName()+" object is created");
}

public String getType(){
return type;
}
public void setType(String type){
this.type=type;
}

public String getService(){
return service;
}
public void setService(String service){
this.service=service;
}

public int getId(){
return id;
}
public void setId(int id){
this.id=id;
}

@Override
public String toString(){
return "CivilServiceDTO-[CivilserviceType="+this.type+", Service="+this.service+", ServiceId="+this.id+"]";
}
}