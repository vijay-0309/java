package com.xworkz;

public class Test {
	static Object obj[]=new Object[3];
	public static void main(String[] args) {
		obj[0]=1;
		obj[1]='p';
		obj[2]="Hudugaru";
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}
