package com.practise.java.MethodReferenceExample.udemyAssignment.tsk1;

public class TestMain {

	public static void main(String[] args) {
		
		MathOperation add = (a,b) -> a+b;
		MathOperation subtract = (a,b) -> a-b;
		MathOperation multiply = (a,b) -> a*b;
		MathOperation divide = (a,b) -> a/b;
		
		
		System.out.println(calculate(add));
		System.out.println(calculate(divide));
		System.out.println(calculate(subtract));
		System.out.println(calculate(multiply));
	}
 
	private static int calculate(MathOperation m) {
		int a= 100;
		int b= 5;
		
		return m.operate(a, b);
	}
}
