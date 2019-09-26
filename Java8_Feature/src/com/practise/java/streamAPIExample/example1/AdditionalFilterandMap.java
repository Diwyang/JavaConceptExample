package com.practise.java.streamAPIExample.example1;

import java.util.ArrayList;
import java.util.List;

public class AdditionalFilterandMap {

	public static void main(String[] args) {

		List<Integer> numLst = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numLst.add(i);
		}

		// Check for EvenNumber
		//ensure that number > 5
		// find the Square and add 2 to that
		// Print it on a console
		
		numLst.stream()
		.peek(i -> System.out.println("Filtered Revieved ...." + i)) //used for debugging.
		.filter(i -> i % 2 == 0)
		.filter(i -> i > 5)
		.peek(i -> System.out.println("Map Revieved ...." + i))
		.map(i -> i * i)
		.map(i -> i + 2)
		.forEach(i -> System.out.println(i));
	}

}
