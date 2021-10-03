class MicrosoftUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Microsoft";
mnc.ceo="BillGates,PaulAllen";
mnc.headQuarter="Wasington";
mnc.startedYear=1975;
mnc.company="Microsoft";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}