class IBMUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="IBM";
mnc.ceo="Charles-Ranlett-Flint,Armonk";
mnc.headQuarter="NewYork";
mnc.startedYear=1911;
mnc.company="IBM";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}