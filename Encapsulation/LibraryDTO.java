public class LibraryDTO{

public LibraryDTO(){
System.out.println("LibraryDTO object is created");
}

private String name;
private String address;
private String type;
private boolean isOpen;
private int noOfBooks;

public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}
public String getAddress(){
return address;
}
public void setAddress(String address){
this.address = address;
}
public String getType(){
return type;
}
public void setType(String type){
this.type = type;
}
public boolean getIsOpen(){
return isOpen;
}
public void setIsOpen(boolean isOpen){
this.isOpen = isOpen;
}

public int getNoOfBooks(){
return noOfBooks;
}
public void setNoOfBooks(int noOfBooks){
	this.noOfBooks =noOfBooks;
}

}