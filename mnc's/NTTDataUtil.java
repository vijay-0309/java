class NTTDataUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="NTTData";
mnc.ceo="Karthik.S";
mnc.headQuarter="Vellakovil,Tirupur";
mnc.startedYear=1988;
mnc.company="NTTData";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}