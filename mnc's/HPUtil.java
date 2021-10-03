class HPUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Hawlett Packard";
mnc.ceo="BillHawellet,DavidPackard";
mnc.headQuarter="PaloAlto";
mnc.startedYear=1939;
mnc.company="HP";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}