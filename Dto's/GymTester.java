package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;

public class GymTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("New Fit Gym");
		collection.add(new GymDTO("AB23453GHF","Rajajinagar"));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
		
	}

}
