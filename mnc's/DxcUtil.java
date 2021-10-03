class DxcUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Dxc Technologies";
mnc.ceo="MikeSalvino,Tysons";
mnc.headQuarter="Virginia";
mnc.startedYear=2017;
mnc.company="Dxc Technologies";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}