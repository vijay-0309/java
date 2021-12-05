package com.xworkz.CollectionAndFrameworks.setInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PetTester {

	public static void main(String[] args) {
		Set set = new TreeSet<>();
		set.add(new PetDTO(2, "Dog", 3, "Black"));
		set.add(new PetDTO(5, "Cat", 1, "White"));
		set.add(new PetDTO(1, "Cow", 15, "White"));
		set.add(new PetDTO(3, "Buffelo", 20, "Black"));
		
		
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Object object = (Object)iterator.next();
			System.out.println(object);
		}
	}
}
