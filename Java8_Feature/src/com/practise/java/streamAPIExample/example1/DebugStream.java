package com.practise.java.streamAPIExample.example1;

import java.util.ArrayList;
import java.util.List;

public class DebugStream {

	public static void main(String[] args) {

		List<Integer> numLst = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numLst.add(i);
		}

		numLst.stream().filter(i -> {
			System.out.println("Filtered Revieved ...."+i);
			return i % 2 == 0;})
		.limit(3)	
		.map(i ->{
				System.out.println("Map Revieved ...."+i);
					return i * i;})
			.forEach(i -> System.out.println(i));
	}

}
