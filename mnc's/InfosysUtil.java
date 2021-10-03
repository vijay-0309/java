class InfosysUtil{

public static void main(String a[]){

Mnc mnc =new Mnc();
mnc.name="Infosys";
mnc.ceo="N.R.Narayanamurthy";
mnc.headQuarter="Bangalore";
mnc.startedYear=1981;
mnc.company="Infosys";

String cmp=mnc.getService();
System.out.println(cmp);

mnc.displayMnc();


}



}