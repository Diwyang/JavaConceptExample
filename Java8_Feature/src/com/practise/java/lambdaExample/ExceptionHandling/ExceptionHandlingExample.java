package com.practise.java.lambdaExample.ExceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int[] sNumber = {1,2,3,4,5};
		
		int key=0;
		
		process(sNumber,key);
		
		process(sNumber,key, (v,k) -> System.out.println(v+k));
		
		process(sNumber,key, (v,k) -> {
			try {
				System.out.println(v/k);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}

	private static void process(int[] sNumber, int key) {
		for(int i : sNumber) {
			System.out.println(i+key);
		}
		
	}

	private static void process(int[] sNumber, int key, BiConsumer<Integer, Integer> con) {
		for(int i : sNumber) {
			con.accept(i, key);
		}
		
	}
}
