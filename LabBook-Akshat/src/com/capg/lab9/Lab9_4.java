package com.capg.lab9;

import java.util.*;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age; 
	}
	
	public String getName() { 
		return name; 
	}
}

public class Lab9_4 {

	public static int compareByName(Person a, Person b) {
		
		return a.getName().compareTo(b.getName());
	}

public static void main(String[] args) {
	
		List<Person> person = new ArrayList<>();

		person.add(new Person("Akshat", 21));
		person.add(new Person("Shivam", 22));
		person.add(new Person("Udit", 19));

		Collections.sort(person, Lab9_4::compareByName);
		System.out.println("Sorted List is :");
		person.stream().map(x -> x.getName()).forEach(System.out::println);
	}
}

