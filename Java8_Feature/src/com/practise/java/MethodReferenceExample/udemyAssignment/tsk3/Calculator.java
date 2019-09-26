package com.practise.java.MethodReferenceExample.udemyAssignment.tsk3;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

	private static final Map<String, MathOperation> map = new HashMap<>();

	static {
		map.put("+", (a, b) -> a + b);
		map.put("-", (a, b) -> a - b);
		map.put("*", (a, b) -> a * b);
		map.put("/", (a, b) -> a / b);
	}

	public static int calculate(String expression) {
		String[] exps = expression.split(" ");
		String operator = null;
		int enteredNumber = 0;
		int onScreenNumber = Integer.parseInt(exps[0]);
		for (int i = 1; i < exps.length; i++) {
			operator = exps[i++];
			enteredNumber = Integer.parseInt(exps[i]);
			onScreenNumber = calculate(onScreenNumber, (MathOperation) map.get(operator), enteredNumber);
		}
		return onScreenNumber;
	}

	private static int calculate(int onScreenNumber, MathOperation m, int enteredNumber) {
		return m.operate(onScreenNumber, enteredNumber);
	}

	@SuppressWarnings("unused")
	public static void addOperator(String key, MathOperation operation) {
		map.put(key, operation);
	}
}
