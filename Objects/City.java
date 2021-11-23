package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class City {
	public static void main(String[] args) {
		Collection collection =new ArrayList<>();
		collection.add("Tumkur");
		collection.add("Davanagere");
		collection.add("Bangalore");
		
		collection.remove("Bangalore");
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
