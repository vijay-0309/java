package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Airport {
	public static void main(String[] args) {
		
		Collection collection =new ArrayList<>();
		collection.add("Kempegowda international airport");
		collection.add("Hubli airport");
		collection.add("Belgavi airport");
		
		collection.remove("Hubli airport");
		System.out.println(collection.size());
		
		collection.forEach(System.out::println);
	}

}
