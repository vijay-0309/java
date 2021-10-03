class AmazonUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Amazon";
mnc.ceo="JeffBezos";
mnc.headQuarter="Seattle,Washington";
mnc.startedYear=1994;
mnc.company="Amazon";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}