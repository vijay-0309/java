class GoogleUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Google";
mnc.ceo="LarrryPage,SergyBrin";
mnc.headQuarter="California";
mnc.startedYear=1998;
mnc.company="google";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}