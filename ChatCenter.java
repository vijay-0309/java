class ChatCenter{

 String centerName;
 int centerId;
 String location;
 String ownerName;
 boolean isOpen;
 String items[]=new String[5];
 

public ChatCenter(){
 System.out.println("ChatCenter constructor is created");
}


public ChatCenter(String centerName,int centerId,String ownerName,String location,boolean isOpen,String items[]){
 this.centerName=centerName;
 this.location=location;
 this.items=items;
 this.centerId=centerId;
 this.isOpen=isOpen;
 this.ownerName=ownerName;
}



public void displayChat(){
 System.out.println(this.centerName+ " " +this.centerId+ " " +this.ownerName+ " " +this.location+ " " +this.isOpen);
}


public void getItems(){
for(int i=0;i<this.items.length;i++){
 System.out.println(this.items[i]);
}
}

}