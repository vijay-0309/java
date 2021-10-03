class OracleUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Oracle";
mnc.ceo="LarryEllision,BobMines";
mnc.headQuarter="Edoates,Austin";
mnc.startedYear=1977;
mnc.company="Oracle";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}