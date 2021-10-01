package com.promineotech.assignment;

import java.util.List;
import java.util.stream.Collectors;

import com.promineotech.assignment.dao.SortDao;
import com.promineotech.assignment.model.Person;
import com.promineotech.assignment.service.SortService;


public class AssignmentStep2 {
	private SortService sortService = new SortService();
	
	public static void main(String[] args) {
		new AssignmentStep2().run();

	}

	private void run() {
		SortDao sortDao = new SortDao();
		
		//public String convertList () {
		System.out.println(
				sortDao.getPeople().stream()
						.map(Person::getFirstName)
						.sorted()
						.collect(Collectors.joining(", ")));
		
	}

}
