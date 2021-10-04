import java.util.Scanner;

class Avg{

static int[] Arr = new int[3];

public static void main(String a[]){

Scanner sc =new Scanner(System.in);
System.out.println("enter the numbers ");
for(int i=0;i<Arr.length;i++){
 Arr[i]=sc.nextInt();
}
getAverage(Arr);
}

public static int getAverage(int[] Arr){
int a=0;
for(int i=0;i<Arr.length;i++){
  
   a=a+Arr[i];
  }
  int Average=0;
  Average=a/Arr.length;
System.out.println("the average of given numbers is " + Average );
return Average;

}


}