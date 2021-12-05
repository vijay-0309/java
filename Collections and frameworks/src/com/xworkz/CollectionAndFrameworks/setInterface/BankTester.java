package com.xworkz.CollectionAndFrameworks.setInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BankTester {

	public static void main(String[] args) {
		Set set = new TreeSet<>();
		set.add(new BankDTO(2, "Vijay", 232434657l, "savings", "sbi"));
		set.add(new BankDTO(4, "abhi", 5765443167l, "savings", "union"));
		set.add(new BankDTO(10, "chetu", 45325467765l, "salary", "bankofbaroda"));
		set.add(new BankDTO(6, "ram", 12345678765l, "credit", "icici"));
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			Object object=(Object)iterator.next();
			System.out.println(object);
		}
	}
}
