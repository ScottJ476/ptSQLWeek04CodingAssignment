package com.promineotech.assignment.model;

import java.util.List;

public class Person {
	private String firstName;
	
	public Person (String name) {
		this.firstName = name;
	}
	
	
	@Override
	public String toString() {
		return "Person [firstName= " + firstName + "]";
	}
	
	public static int compare(Person p1, Person p2) {
		return p1.firstName.compareTo(p2.firstName);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	//Setter is not needed.
	
}
