class ElectricalUtil{

public static void main(String a[]){

Engineer eee=new Engineer();
eee.branch="Electrical Engineering";
eee.collage="BGMIT";
eee.place="Mudhol";
eee.university="VTU";
eee.dept="Electrical";

String ee=eee.problemSolving();
System.out.println(ee);

eee.displayDetails();

}

}