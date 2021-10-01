package com.promineotech.assignment.service;

import java.util.Comparator;
import java.util.List;

import com.promineotech.assignment.dao.SortDao;
import com.promineotech.assignment.model.Person;

public class SortService {
	private SortDao sortDao = new SortDao();
	
	public List<Person> getPeople(SortType type) {
		List<Person> people = sortDao.getPeople();
		Comparator<Person> comp = null;
		
		switch(type) {
		case LAMBDA:
			comp = (p1, p2) -> Person.compare(p1,  p2);
			
			break;
		case METHOD_REFERENCE:
			comp = Person::compare;
			
			break;
		default:
			throw new RuntimeException("Unhandled sort type: " + type);
		}
		
		people.sort(comp);
		return people;
		}
}
