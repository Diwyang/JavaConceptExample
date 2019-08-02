package com.practise.java.lambdaExample;


interface I{
	void show();
}


public class LambdaExample1 {

	public static void main(String[] args) {
		
		I a = new I() {
			public void show()
			{
				System.out.println("Show from LambdaExample1");
			}
		};
		a.show();
	}

}
