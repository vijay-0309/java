package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ContactTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Phone-Book");
		collection.add(new ContactDTO("viji",6361237903l));
		System.out.println(collection.size());
		
		Object[] obj=collection.toArray();
		for (int i = 0; i < obj.length; i++) {
			
		}
	 
		
		Collection collection1=new ArrayList<>();
		collection1.add("contact");
		collection1.add(new ContactDTO("manju",9945280800l));
		collection1.addAll(collection);
		//collection1.removeAll(collection1);
		//System.out.println(collection1.size());
		collection1.retainAll(collection);
		System.out.println(collection1.size());
		
		System.out.println(collection1.toString());
		System.out.println(collection1.hashCode());
		
		
		
		Collection coll=new ArrayList<>();
		coll.add("name");
		coll.addAll(collection1);
		//coll.remove("contact");
		coll.retainAll(collection1);
		System.out.println(coll.size());
		
		List collection2=new ArrayList<>();
		
		/* when we are going to compare empty collection with contained collection
		Collection colle=null;
		try {
			System.out.println(colle.containsAll(collection1));
		}catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println("not possible");
		} */
		
		
		System.out.println(coll.size());
		coll.forEach(System.out::println);
		System.out.println(collection1.isEmpty());
		System.out.println(coll.contains("contact"));
		System.out.println(collection2.containsAll(coll));
		
		System.out.println(collection1.equals(collection2));
		
	}

}
