package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;

public class HospitalTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Vikram-Hospital");
		collection.add(new PatientDTO(2,"manu"));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
