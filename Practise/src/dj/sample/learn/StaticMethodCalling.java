package dj.sample.learn;

class Shape{
	static void draw() {
		System.out.println("Drawing Shape");
	}
}

class Square extends Shape{
	static void draw() {
		System.out.println("Drawing Square");
	}
}

class Rectangle extends Shape{
	static void draw() {
		System.out.println("Drawing Rectangle");
	}
}

public class StaticMethodCalling {

	public static void main(String[] args) {

		Shape s = new Shape();
		s.draw();
		
		s = new Square();
		s.draw();
		
		s = new Rectangle();
		s.draw();
		
		Square ss = new Square();
		ss.draw();
		 
	}

}
