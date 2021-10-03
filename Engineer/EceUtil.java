class EceUtil{

public static void main(String a[]){

Engineer ece=new Engineer();
ece.branch="Electronics and communication";
ece.collage="KIT,Tiptur";
ece.place="Tiptur";
ece.university="VTU";
ece.dept="Ece";

String Ece=ece.problemSolving();
System.out.println(Ece);

ece.displayDetails();

}

}