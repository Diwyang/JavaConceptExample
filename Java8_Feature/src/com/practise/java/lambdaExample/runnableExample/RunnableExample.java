package com.practise.java.lambdaExample.runnableExample;

public class RunnableExample {

	public static void main(String[] args) {
		//Classic Method
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed from Runnable");
				
			}
		});
		myThread.run();
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed from Lambda Runnable Thread"));
		myLambdaThread.run();
	}

}
