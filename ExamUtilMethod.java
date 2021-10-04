import java.util.Scanner;// user input program ge bekiro command

class ExamUtilMethod{

static String[] hallTicket;

  public static void main(String a[])//ee mwthod use madudre java filename space kottu details fill madbeku aaga op baratte 
{
  Scanner sc=new Scanner(System.in); // ee method jst user input data tagolake
  System.out.println("Enter collage name ");
  String collageName=sc.next();
  System.out.println(collageName);
  
  ExamMethodOverloading.allow(a);
  ExamMethodOverloading.allow(1350);

}
}