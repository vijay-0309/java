package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class BloodGroup {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("B+ve");
		collection.add("A+ve");
		collection.add("O+ve");
		
		collection.remove("A+ve");
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
