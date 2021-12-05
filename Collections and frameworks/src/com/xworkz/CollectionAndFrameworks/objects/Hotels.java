package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Hotels {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Hotel Areca");
		collection.add("Mayura Hotel");
		
		collection.remove("Mayura Hotel");
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
