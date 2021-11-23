package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;

public class ContactTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Phone-Book");
		collection.add(new ContactDTO("viji",6361237903l));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
