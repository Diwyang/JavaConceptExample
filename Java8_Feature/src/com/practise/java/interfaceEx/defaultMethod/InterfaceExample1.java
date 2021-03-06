package com.practise.java.interfaceEx.defaultMethod;


interface K{
	default void show() {
		System.out.println("Show from Interface K");
	}
}

interface J{
	default void show() {
		System.out.println("Show from Interface J");
	}
}


public class InterfaceExample1 implements K,J {

	public static void main(String[] args) {

		InterfaceExample1 ie = new InterfaceExample1();
		ie.show();

	}

	@Override
	public void show() {
		System.out.println("Show from InterfaceExample1");
	}

}
