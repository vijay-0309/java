package com.xworkz.CollectionAndFrameworks.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class LiknkedList {
	public static void main(String[] args) {
		
		List list=new LinkedList<>();
		//List list=new ArrayList<>();
		list.add("vijay");
		list.add("Abhishek");
		list.add("Chetu");

		System.out.println("Iterator op is below");

		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			String data=(String)itr.next();
			System.out.println(data);
		}  
		System.out.println("\n");
		
		System.out.println("ListIterator  hasPrevious() op is below");
		ListIterator it=list.listIterator();
		while(it.hasPrevious()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		System.out.println("\n");
		
		System.out.println("ListIterator  hasNext() op is below");
		System.out.println("forward direction data");
		ListIterator it1=list.listIterator();
		while(it1.hasNext()) {
			Object obj=it1.next();
			System.out.println(obj);
		}
		System.out.println("\n");
		
		System.out.println("backward direction data");
		while(it1.hasPrevious()) {
			System.out.println(it1.previous());
		}
		
		System.out.println("set hashSet");
		Set set=new HashSet<>();
		set.add("abhi");
		set.add("vijay");
		set.add("yash");
		
		set.forEach(System.out::println);
		
		System.out.println("set linkedHashset");
		Set se=new LinkedHashSet<>();
		se.add("Abhi");
		se.add("viji");
		se.add("ram");
		
		se.forEach(System.out::println);
		
		System.out.println("set treeset");
		Set s=new TreeSet<>();
		s.add("1");
		s.add("1abhi");
		s.add("2abhi");
		s.add("ram");
		s.add("1viji");
		
		s.forEach(System.out::println);
}

}