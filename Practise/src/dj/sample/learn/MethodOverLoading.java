package dj.sample.learn;

public class MethodOverLoading {
	
	int i;
	
	MethodOverLoading() {
		this(1);
		System.out.println("Hello ");
	}
	
	MethodOverLoading(int i) {
		this(1,1);
		System.out.println("Hi ");
	}
	
	MethodOverLoading(int i, int j) {
		System.out.println("Hurray ");
	}
	
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();

	}

}
