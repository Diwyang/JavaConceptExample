package com.practise.java.streamAPIExample.example1;

import java.util.ArrayList;
import java.util.List;

public class SkipStream {

	public static void main(String[] args) {

		List<Integer> numLst = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			numLst.add(i);
		}

		numLst.stream()
		.skip(4)
		.peek(i -> System.out.println("Filtered Revieved ...." + i)) //used for debugging.
		.filter(i -> i % 2 == 0)
		.limit(4)
		.peek(i -> System.out.println("Map Revieved ...." + i))
		.map(i -> i * i)
		.forEach(i -> System.out.println(i));
	}

}
