package com.practise.java.MethodReferenceExample;

import java.util.Objects;

interface StringOperations {

	public void accept(String a);
	
}

public class MethodReferenceExample3 {

	public static void main(String[] args) {

		StringOperations op1 = (s) -> System.out.println("String is "+s);
		op1.accept("diwyang");
		
		StringOperations op2 = (s) -> System.out.println(s);
		op2.accept("diwyang");
		
		StringOperations op3 = System.out::println;
		op3.accept("diwyang");
		
//		StringOperations op4 = System.out::println("String is "+s);
//		op4.accept("diwyang");
		
	}

}
