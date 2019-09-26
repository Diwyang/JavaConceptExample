package com.practise.java.streamAPIExample.example1;

import java.util.ArrayList;
import java.util.List;

public class SortStreamEx {

	public static void main(String[] args) {

		List<Integer> numLst = new ArrayList<>();
		for (int i = 10; i > 0; i--) {
			numLst.add(i);
		}

		numLst.stream().filter(i -> {
			System.out.println("Filtered Revieved ...."+i);
			return i % 2 == 0;})
		.sorted()
		.limit(3)	
		.map(i ->{
				System.out.println("Map Revieved ...."+i);
					return i * i;})
			.forEach(i -> System.out.println(i));

	System.out.println("........Changing the position for Sorted........");
	
	numLst.stream().filter(i -> {
		System.out.println("Filtered Revieved ...."+i);
		return i % 2 == 0;})
	.limit(3)
	.sorted()
	.map(i ->{
			System.out.println("Map Revieved ...."+i);
				return i * i;})
		.forEach(i -> System.out.println(i));
}

}
