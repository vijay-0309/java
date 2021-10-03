class MphasisUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Mphasis";
mnc.ceo="Jerryrao,JervinTas";
mnc.headQuarter="Bangalore";
mnc.startedYear=1998;
mnc.company="Mphasis";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}