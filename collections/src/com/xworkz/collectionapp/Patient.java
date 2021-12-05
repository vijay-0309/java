package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;



public class Patient {
	public static void main(String[] args) {
		
		Collection collection =new ArrayList<>();
		
		collection.add(1);
		collection.add("snapchat");
		collection.add(560.00);
		collection.add('D');
		
		System.out.println(collection);//to print collection
		
		collection.remove(1);// used to remove the content of collection based on data
		
		//collection.removeAll(collection);//to delete entire collection
		

		System.out.println(collection.size());//to print size of collection
		
		collection.forEach(System.out::println);//print data of collection as for loop
		
		
	}

}
