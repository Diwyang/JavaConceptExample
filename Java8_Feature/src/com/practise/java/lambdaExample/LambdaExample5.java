package com.practise.java.lambdaExample;

public class LambdaExample5 {

	
	public static void main(String[] args) {
		
		System.out.println("Starting Execution.......");
		
		//recieveNumber(getNumber());
		test(s -> {
			System.out.println("calling lambda.....");
			return s.toUpperCase();
		});
		
		System.out.println("Stoping Execution.......");
	}

	private static void test(GreetingService g) {
		System.out.println("Inside test Method.");
		System.out.println(g.greet("diwyang"));
		
	}

	private static int getNumber() {
		System.out.println("Called getNumber");
		return 5;
	}
		
	private static void recieveNumber(int i) {
		System.out.println("Recieved number is "+i);
	}
	
}
