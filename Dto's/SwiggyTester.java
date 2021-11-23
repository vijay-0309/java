package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;

public class SwiggyTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Order food eat and enjoy");
		collection.add(new SwiggyDTO("Sriharsha-Majety",2013,"Online food order-delivary "));
		
		System.out.println(collection.size());
		collection.forEach(System.out:: println);
	}

}
