class QualcommUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Qualcomm";
mnc.ceo="TwinJacobs,AndrewViterbai";
mnc.headQuarter="SanDeigo";
mnc.startedYear=1985;
mnc.company="Qualcomm";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}