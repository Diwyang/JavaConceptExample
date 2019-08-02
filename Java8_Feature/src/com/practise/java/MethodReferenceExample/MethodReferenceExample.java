package com.practise.java.MethodReferenceExample;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Diwyang","Santosh","Gagan","Gajendra");
		
		//names.forEach(n -> System.out.println(n));

		names.forEach(System.out::println);
		
	}

}
