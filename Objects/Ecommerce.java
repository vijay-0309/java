package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Ecommerce {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("FlipKart");
		collection.add("Amazon");
		collection.add("Myntra");
		collection.add("Ajio");
		
		collection.remove("Ajio");
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
