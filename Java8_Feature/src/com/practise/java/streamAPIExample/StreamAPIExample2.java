package com.practise.java.streamAPIExample;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIExample2 {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		for (int i =0; i<=30;i++) {
			values.add(i);
		}

		//values.forEach(System.out::println); //Method Reference
		
		values.stream().filter(i -> {
			System.out.println("hi " +i); return true;
		}).findFirst();
					
	}

}
