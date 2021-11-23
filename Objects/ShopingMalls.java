package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class ShopingMalls {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Orion");
		collection.add("Mantri square");
		collection.add("U B City mall");
		collection.add("Garuda mall");
		
		collection.remove("Garuda mall");
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
