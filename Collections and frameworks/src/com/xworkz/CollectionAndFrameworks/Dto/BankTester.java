package com.xworkz.CollectionAndFrameworks.Dto;

import java.util.ArrayList;
import java.util.Collection;

public class BankTester {
	public static void main(String[] args) {
		Collection collection=new ArrayList<>();
		collection.add("Under Reserve Bank of India");
		//we can use BankDTO bank=new BankDTO("Sbi bank","Rajajinagar");
		//           collection.add(bank);     also it needs 2 line so we move for one line itself.
		collection.add(new BankDTO("SBI Bank","Rajajinagar"));
		
		System.out.println(collection.size());
		collection.forEach(System.out::println);
	}

}
