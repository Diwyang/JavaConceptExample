package com.practise.java.MethodReferenceExample.udemyAssignment.tsk3;

public class TestMain {

	public static void main(String[] args) {

		System.out.println(Calculator.calculate("5 + 2 - 3 * 7 + 2 / 3"));

		System.out.println(Calculator.calculate("10 / 2 * 3 - 3 / 3 * 5"));

		System.out.println(Calculator.calculate("9 * 9 - 1 * 7 / 8 + 30"));

		Calculator.addOperator("^", (a, b) -> (int) Math.pow(a, b));

		System.out.println(Calculator.calculate("9 * 9 - 1 * 7 / 8 + 30 ^ 2"));

		Calculator.addOperator("%", (a, b) -> a % b);

		System.out.println(Calculator.calculate("9 * 9 - 1 * 7 / 8 + 30 ^ 2 % 3"));

	}

}
