package com.practise.java.interfaceEx.defaultMethod;


interface II{
	default void show() {
		System.out.println("Show from Interface I");
	}
}

abstract class abstractClass{
	
	public void show() {
		System.out.println("Show from abstractClass");
	}
}

public class InterfaceExample3 extends abstractClass implements II {

	public static void main(String[] args) {

		InterfaceExample3 ie = new InterfaceExample3();
		ie.show();

	}

}
