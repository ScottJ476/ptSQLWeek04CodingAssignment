package com.promineotech.assignment;

import java.util.List;

import com.promineotech.assignment.model.Person;
import com.promineotech.assignment.service.SortService;
import com.promineotech.assignment.service.SortType;



public class Assignment {
	private SortService sortService = new SortService();
	
	public static void main(String[] args) {
		new Assignment().run();

	}

	private void run() {
		List<Person> people = sortService.getPeople(SortType.METHOD_REFERENCE);
		print(people, SortType.METHOD_REFERENCE);	
	}

	private void print(List<Person> people, SortType type) {
		switch(type) {
		case LAMBDA:
			people.forEach(person -> System.out.println(person.getFirstName()));
			
			break;
			
		case METHOD_REFERENCE:
			people.forEach(System.out::println);
			
			break;
			
		default:
			
			break;
		}
	}
		

}
