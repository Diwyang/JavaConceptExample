package com.practise.java.lambdaExample;


interface Lambda{
	void show();
}

interface Lambda1{
	int add(int i, int j);
}


public class LambdaExample3 {

	public static void addition(Lambda1 l, int a, int b) {
		System.out.println(l.add(a, b));
	}
	public static void main(String[] args) {
		
		Lambda a = () -> System.out.println("Show from LambdaExample1");

		Lambda1 b =  (int i, int j) -> i + j;
		
		b.add(5, 6);
		
		Lambda1 innerLambda = new Lambda1() {
			public int add(int x, int y) {
				return x+y;
			}
		};
		System.out.println(innerLambda.add(5, 6));
		
		addition(b,5,6);
		addition(innerLambda,10,27);
		
	}

}
