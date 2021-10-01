package com.promineotech.assignment.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import com.promineotech.assignment.model.Person;

public class OptionalService {	
	//This is method A.
	public Person find(Optional<Person> optionalPerson) {
		return optionalPerson.orElseThrow(() -> new NoSuchElementException(
				"It appears that " + optionalPerson + " is missing."));	
	}
}
