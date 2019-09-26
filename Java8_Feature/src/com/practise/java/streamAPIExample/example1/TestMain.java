package com.practise.java.streamAPIExample.example1;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		List<Integer> numLst = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numLst.add(i);
		}

		// Check for EvenNumber
		// find the Square
		// Print it on a console

		for (int j = 0; j <= numLst.size(); j++) {
			if (j % 2 == 0) {
				System.out.println(j * j);
			}
		}

		numLst.stream().filter(i -> i % 2 == 0)
			.map(i -> i * i)
			.forEach(i -> System.out.println(i));
	}

}
