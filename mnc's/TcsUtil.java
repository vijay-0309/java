class TcsUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Tata Consulting Services";
mnc.ceo="Ratan Tata";
mnc.headQuarter="Mumbai";
mnc.startedYear=1968;
mnc.company="TCS";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}