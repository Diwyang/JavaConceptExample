package com.practise.java.forEachExample;

import java.util.Arrays;
import java.util.List;

public class ForEachExample1 {

	public static void main(String[] args) {
	
		List<Integer> values = Arrays.asList(4,5,6,7,8,9);
		values.forEach(i -> System.out.println(i));
	}

}
