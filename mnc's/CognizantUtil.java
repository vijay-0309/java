class CognizantUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Cognizant";
mnc.ceo="Kumar-Mahadevan,Francisco-Dsouza";
mnc.headQuarter="Teaneck,NewJersy";
mnc.startedYear=1994;
mnc.company="Cognizant";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}