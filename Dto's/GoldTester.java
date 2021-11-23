package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;

public class GoldTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Sai jewelers");
		collection.add(new GoldDTO(15,"Rose-Gold"));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
