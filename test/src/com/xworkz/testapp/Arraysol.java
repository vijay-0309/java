package com.xworkz.testapp;
import java.util.*;

public class Arraysol {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=i;
		}
		System.out.println(sum);
	
	}
	
	

}
