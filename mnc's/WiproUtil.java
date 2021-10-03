class WiproUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Wipro";
mnc.ceo="Mohammed Premji";
mnc.headQuarter="Bangalore";
mnc.startedYear=1945;
mnc.company="Wipro";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}