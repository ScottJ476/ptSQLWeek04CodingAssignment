package com.promineotech.assignment;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

import com.promineotech.assignment.model.Person;
import com.promineotech.assignment.service.OptionalService;
import com.promineotech.assignment.service.SortService;
//import com.promineotech.assignment.service.SortService;
import com.promineotech.assignment.service.SortType;

public class AssignmentStep3 {
	private Scanner scanner = new Scanner(System.in);
	private OptionalService service = new OptionalService();
	private SortService sortService = new SortService();
	

	
	public static void main(String[] args) {
		new AssignmentStep3().run();
	}
	
	//This is method B
	private void run() {
		List<Person> people = sortService.getPeople(SortType.LAMBDA);
		boolean done = false;
		
		
		while (!done) {
			System.out.print("Enter something: ");
			String search = scanner.nextLine();
			
			if (search.isEmpty()) {
				done = true;	
			} else {
				try {
					if (search.equals("missing")) {
						System.out.println(service.find(Optional.empty()));;
					} else {
						for (Person person : people) {
							if (search.equals(person.getFirstName())) {
								Person found = service.find(Optional.of(person));
								System.out.println("I found " + found + "!");
							}
						}
					}
				} catch (NoSuchElementException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
}
