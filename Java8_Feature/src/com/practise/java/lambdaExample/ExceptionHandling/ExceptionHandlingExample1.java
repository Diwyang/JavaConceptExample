package com.practise.java.lambdaExample.ExceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		
		int[] sNumber = {1,2,3,4,5};
		
		int key=0;
		
		
		process(sNumber,key, wrapperLambda((v,k) -> System.out.println(v/k)));
		

	}

	private static BiConsumer<Integer, Integer> wrapperLambda( BiConsumer<Integer, Integer> con) {
		return (v,k) ->{
			try {
				System.out.println("Call from Wrapper Class");
				con.accept(v, k);
			} catch (Exception e) {
				System.out.println("Exception");
			}
		};
	}

	private static void process(int[] sNumber, int key, BiConsumer<Integer, Integer> con) {
		for(int i : sNumber) {
			con.accept(i, key);
		}
		
	}

	
}
