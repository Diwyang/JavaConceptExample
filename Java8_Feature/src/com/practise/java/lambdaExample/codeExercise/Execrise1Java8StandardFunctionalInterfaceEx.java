package com.practise.java.lambdaExample.codeExercise;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Execrise1Java8StandardFunctionalInterfaceEx {

	public static void main(String[] args) {

		List<Person> peoples = Arrays.asList(new Person("Diwyang", "Jain", 35), new Person("Santosh", "Sahu", 34),
				new Person("Gagan", "Gokhale", 33), new Person("Gajendra", "Thakur", 36),
				new Person("Ankit", "Jain", 35));

		// Step 1: Sort List by Last name
		Collections.sort(peoples, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2: Create a method to print all elements in the list

 		printListConditionally(peoples, p -> true, p -> System.out.println(p));

		// Step 3: Create a method that print all the people hat have last name begins
		// with "J"

		printListConditionally(peoples, p -> p.getFirstName().startsWith("D"), p -> System.out.println(p));
		
		printListConditionally(peoples, p -> p.getFirstName().startsWith("D"), p -> System.out.println(p.getFirstName()));

		printListConditionally(peoples, p -> p.getLastName().startsWith("J"), p -> System.out.println(p));
	}

	private static void printListConditionally(List<Person> peoples, Predicate<Person> pp, Consumer<Person> c) {
		for (Person p : peoples) {
			if (pp.test(p)) {
				c.accept(p);
			}
		}

	}

}