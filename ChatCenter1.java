class ChatCenter1{

 String centerName;
 int centerId;
 String location;
 String ownerName;
 boolean isOpen;
 String items[]={"PaniPuri","Kachori","Samosa","Pav Bhaji","Sandwich"};
 

public ChatCenter1(){
 this("SaiChats",143,"Ranganath","nearKLEground",true);
 System.out.println("ChatCenter constructor is created");

}


public ChatCenter1(String centerName,int centerId,String ownerName,String location,boolean isOpen){
 this.centerName=centerName;
 this.location=location;
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