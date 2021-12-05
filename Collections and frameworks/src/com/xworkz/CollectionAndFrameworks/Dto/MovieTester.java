package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;

public class MovieTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Watch movie and enjoy");
		collection.add(new MovieDTO("Mr&mrs.Ramachari","Yash","Radhika-pandith"));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
