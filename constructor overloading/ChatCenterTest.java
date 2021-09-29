class ChatCenterTest{


public static void main(String a[]){
 
 ChatCenter center=new ChatCenter();
 center.items[0]="PaniPuri";
 center.items[1]="kachori";
 center.items[2]="Samosa";
 center.items[3]="Pav Bhaji";
 center.items[4]="Sandwich";
 
 ChatCenter center1=new ChatCenter("SaiChats",143,"Ranganath","nearKLEground",true,center.items);
 center1.displayChat();
 center1.getItems();

}


}