class Townname{
static String[] townName={"Davanagere","Chitradurga","Chikmagalur","Bangalore"};

public static void main(String a[]){
getTownname();

}

public static void getTownname(){

for(int i=0;i<townName.length;i++){

System.out.print(townName[i]+"  ");

}
}
}