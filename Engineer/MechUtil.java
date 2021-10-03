class MechUtil{

public static void main(String a[]){

Engineer mech=new Engineer();
mech.branch="Mechanical Engineering";
mech.collage="AIT";
mech.place="Chikmagalur";
mech.university="VTU";
mech.dept="Mechanical";

String Mech=mech.problemSolving();
System.out.println(Mech);

mech.displayDetails();

}

}