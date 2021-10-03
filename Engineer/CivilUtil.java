class CivilUtil{

public static void main(String a[]){

Engineer civil=new Engineer();
civil.branch="Civil Engineering";
civil.collage="SDM";
civil.place="Ujire";
civil.university="VTU";
civil.dept="Civil";

String cvl=civil.problemSolving();
System.out.println(cvl);

civil.displayDetails();

}

}