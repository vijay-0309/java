class AccentureUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Accenture";
mnc.ceo="Julie sweet";
mnc.headQuarter="Dublin-Ireland";
mnc.startedYear=1989;
mnc.company="Accenture";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}