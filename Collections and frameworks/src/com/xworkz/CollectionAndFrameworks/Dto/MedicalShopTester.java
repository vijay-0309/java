package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;


public class MedicalShopTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
	    collection.add("welcome");
	    collection.add(new MedicalShopDTO("Apolo Pharmacy","Rajajinagar",9743776158l));
	   
	    System.out.println(collection.size());
	    collection.forEach(System.out::println);
	}

}
