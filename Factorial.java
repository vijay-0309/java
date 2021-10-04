class Factorial{

public static void main(String a[]){
System.out.println("main method started");
calculateFactorial(5);
System.out.println("main method ended");
}

public static void calculateFactorial(int num){
System.out.println("calculateFactorial method started");
int fact=1;

for(int i=1;i<=num;i++) {
fact=fact*i;
}
System.out.println(fact);
System.out.println("calculateFactorial method ended");
}

}