package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class Mobiles {
	public static void main(String[] args) {
		Collection collection =new ArrayList<>();
		collection.add("Vivo");
		collection.add("Xiomi");
		collection.add("Realme");
		
		collection.remove("Realme");
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
