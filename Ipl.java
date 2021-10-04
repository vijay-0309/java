class Ipl{
 static String[] teamName= {"RCB","MI","CSK","KXIP","DC","KKR"};

public static void main(String a[]){
getTeamName();
}

public static void getTeamName(){
for(int i=0;i<teamName.length;i++){
 System.out.print(teamName[i]+"  ");
}
}
}