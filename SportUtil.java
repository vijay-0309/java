class SportUtil{

public static void main(String a[]){

Sport data=new Sport();
data.nameOfSports="Cricket";
data.noOfPlayers=11;

Sport.getContents();
System.out.println(data.nameOfSports+"\n"+data.noOfPlayers+"\n");

Sport data1=new Sport();
data1.nameOfSports="Kho-Kho";
data1.noOfPlayers=9;

Sport.getContents();
System.out.println(data1.nameOfSports+"\n"+data1.noOfPlayers+"\n");

Sport data2=new Sport();
data2.nameOfSports="Kabbadi";
data2.noOfPlayers=7;

Sport.getContents();
System.out.println(data2.nameOfSports+"\n"+data2.noOfPlayers+"\n");


}



}