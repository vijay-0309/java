class MulDiv{

 public static void main(String a[]){


mul(3,6);
mul(2,3,8);
div(10,2);
div(100,25,5);

}
public static void mul(int a, int b){
System.out.println(a*b);
}


public static void mul(int a, int b,int c){
System.out.println(a*b*c);
}

public static void div(int a, int b){
System.out.println(a/b);
}


public static void div(int a, int b,int c){
System.out.println(a/b/c);
}

}