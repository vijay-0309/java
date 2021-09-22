//example of method overloading ie,declaring same method with sam method name and different in no of parameters

class AddSub{

 public static void main(String a[]){


add(14,6);
add(12,23,34);
sub(10,2);
sub(100,50,25);

}
public static void add(int a, int b){
System.out.println(a+b);
}


public static void add(int a, int b,int c){
System.out.println(a+b+c);
}

public static void sub(int a, int b){
System.out.println(a-b);
}


public static void sub(int a, int b,int c){
System.out.println(a-b-c);
}

}