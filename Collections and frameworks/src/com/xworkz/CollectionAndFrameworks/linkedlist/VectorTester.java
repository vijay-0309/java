package com.xworkz.CollectionAndFrameworks.linkedlist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTester {

	public static void main(String[] args) {
		Vector vector = new Vector<>();
		vector.add("A");
		vector.add("B");
		vector.add("Z");
		
		Iterator iterator=vector.iterator();
		while (iterator.hasNext()) {
			System.out.println((String)iterator.next());
			System.out.println(System.nanoTime());
			
		}

		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println((String)enumeration.nextElement());
			System.out.println(System.nanoTime());
		}
	}
}
