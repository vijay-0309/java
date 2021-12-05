package com.xworkz;

import java.util.Scanner;

public class RevNum {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) {
			int a=num%10;
		    rev=rev*10+a;
			num=num/10;
		}
		System.out.println(rev);
	}
	
}
