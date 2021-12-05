package com.xworkz.CollectionAndFrameworks.setInterface;

public class PetDTO implements Comparable<PetDTO>{

	private int id;
	private String name;
	private int age;
	private String color;
	
	public PetDTO(int id, String name, int age, String color) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PetDTO [id=" + id + ", name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
//to achive custom sorting by pet name
	@Override
	public int compareTo(PetDTO o) {
		return (int)this.getName().compareTo(o.getName());
	}

/*	to achive the default sorting for id
 * @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public int compareTo(PetDTO o) {
		return this.hashCode() - o.hashCode();
	} */
	
	
	
}
