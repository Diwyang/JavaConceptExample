package com.practise.java.interfaceEx.staticMethod;


interface I{
	static void show() {
		System.out.println("Show from Interface I");
	}
}


public class InterfaceExample2 implements I {

	public static void main(String[] args) {

		//InterfaceExample ie = new InterfaceExample();
		I.show();

	}

}
