package com.promineotech.assignment.dao;

import java.util.ArrayList;
import java.util.List;

import com.promineotech.assignment.model.Person;

public class SortDao {
	List<Person> people = new ArrayList<>(List.of(new Person("Scott"), new Person("Julie"), new Person("Sofia "),
			new Person("Paul"), new Person("Elaine"), new Person("Jim"), new Person("Florence"), new Person("Jerry")));

	public List<Person> getPeople() {
		return people;
	}
}
