package com.xworkz.CollectionAndFrameworks.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	
	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("KGF");
		list.add("Tarak");
		list.add(null);
		list.add("Kotigobba-2");
		list.add("Amar");
		list.add(null);
		list.add("KGF");
		
		list.remove("KGF");
	// is used to remove a single value from list	list.remove("KGF");
		System.out.println(list.size());
		list.forEach(System.out::println);
		
		
	}

}
