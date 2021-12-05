package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Laptops {
	public static void main(String[] args) {
		
		Collection collection=new ArrayList<>();
		collection.add("Hp");
		collection.add("Lenovo");
		collection.add("Mac");
		
		
		collection.remove("Mac");
		System.out.println(collection.size());
		collection.forEach(System.out::println);
		
	}

}
