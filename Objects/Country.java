package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Country {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("India");
		collection.add("Pakistan");
		collection.add("SriLanka");
		
		collection.remove("Pakistan");
		System.out.println(collection.size());
		
		collection.forEach(System.out::println);
	}

}
