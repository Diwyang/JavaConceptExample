package com.practise.java.lambdaExample;

public class LambdaExample4 {

	
	public static void main(String[] args) {
		
		System.out.println("Starting Execution.......");
		
		System.out.println(getLambda().greet("Diwyang"));
		
		System.out.println("Stoping Execution.......");
	}

	private static void test(GreetingService g) {
		System.out.println("Inside test Method.");
		System.out.println(g.greet("diwyang"));
		
	}

	private static GreetingService getLambda() {
		System.out.println("Called getLambda");
		return s -> s.toLowerCase();
	}
		
	private static void recieveNumber(int i) {
		System.out.println("Recieved number is "+i);
	}
	
}
