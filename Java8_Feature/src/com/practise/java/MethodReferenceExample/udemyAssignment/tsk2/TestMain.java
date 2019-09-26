package com.practise.java.MethodReferenceExample.udemyAssignment.tsk2;

public class TestMain {

	public static void main(String[] args) {
		
		MathOperation add = (a,b) -> a+b;
		MathOperation subtract = (a,b) -> a-b;
		MathOperation multiply = (a,b) -> a*b;
		MathOperation divide = (a,b) -> a/b;
		
		int onScreenNumber = 0;
	
		// 5 + 2 - 3 * 7 + 2 / 3   = 10
		
		onScreenNumber = calculate(5, add, 2);
		onScreenNumber = calculate(onScreenNumber, subtract, 3);
		onScreenNumber = calculate(onScreenNumber, multiply, 7);
		onScreenNumber = calculate(onScreenNumber, add, 2);
		onScreenNumber = calculate(onScreenNumber, divide, 3);
		
		
		System.out.println(onScreenNumber);
	}
 
	private static int calculate(int onScreenNumber,MathOperation m, int enteredNumber) {
		return m.operate(onScreenNumber,enteredNumber);
	}
}
