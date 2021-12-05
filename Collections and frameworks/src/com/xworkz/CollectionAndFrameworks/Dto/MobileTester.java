package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;

public class MobileTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Sangeetha Mobiles");
		collection.add(new MobileDTO("Xiomi","Redmi note 8 pro",15000));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
