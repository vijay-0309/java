package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;

public class BookTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Sarvajanik-Library");
		collection.add(new BookDTO(3,"Simon-Haykin","4th Edision"));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
		
	}

}
