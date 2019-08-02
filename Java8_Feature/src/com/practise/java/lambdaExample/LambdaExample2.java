package com.practise.java.lambdaExample;


interface II{
	void show();
}

interface II1{
	void show(int i);
}


public class LambdaExample2 {

	public static void main(String[] args) {
		
		II a ;
		a = () -> System.out.println("Show from LambdaExample1");

		a.show();
		
		II1 b =  i -> System.out.println("Value is "+i);
		b.show(9);
	}

}
