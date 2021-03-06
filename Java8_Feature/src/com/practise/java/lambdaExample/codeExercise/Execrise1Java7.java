package com.practise.java.lambdaExample.codeExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Execrise1Java7 {

	public static void main(String[] args) {

		List<Person> peoples = Arrays.asList(new Person("Diwyang", "Jain", 35), new Person("Santosh", "Sahu", 34),
				new Person("Gagan", "Gokhale", 33), new Person("Gajendra", "Thakur", 36),
				new Person("Arinjay", "Jain", 30));

		// Step 1: Sort List by Last name
		Collections.sort(peoples, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Step 2: Create a method to print all elements in the list

		printAll(peoples);

		// Step 3: Create a method that print all the people hat have last name begins
		// with "J"
		printListWithLastNameBegins(peoples);

		printListConditionally(peoples, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("J");
			}
		});

		printListConditionally(peoples, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("D");
			}
		});
	}

	private static void printListWithLastNameBegins(List<Person> peoples) {
		for (Person p : peoples) {
			if (p.getLastName().startsWith("J")) {
				System.out.println(p);
			}
		}

	}

	private static void printListConditionally(List<Person> peoples, Condition c) {
		for (Person p : peoples) {
			if (c.test(p)) {
				System.out.println(p);
			}
		}

	}

	private static void printAll(List<Person> peoples) {

		for (Person p : peoples) {
			System.out.println(p);
		}

	}

}
