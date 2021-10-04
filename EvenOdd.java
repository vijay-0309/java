import java.util.Scanner;

class EvenOdd{

public static void main(String a[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to check even or odd");
int number=sc.nextInt(); 
getEvenOdd(number);


}
public static int getEvenOdd(int number){
 System.out.println("getevenodd method started");
 if(number%2==0){
  System.out.println("the given number"+ number + " is even");
 }
 else{
System.out.println("the given number"+ number + " is odd");  
}

 System.out.println("getevenodd method ended");
return number;
}


}