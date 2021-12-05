package com.xworkz.CollectionAndFrameworks.objects;

import java.util.ArrayList;
import java.util.Collection;

public class ClothBrands {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("PeterEngland");
		collection.add("VanHussen");
		collection.add("Zudio");
		
		collection.remove("VanHussen");
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
