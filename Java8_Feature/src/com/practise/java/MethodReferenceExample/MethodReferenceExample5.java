package com.practise.java.MethodReferenceExample;

import java.util.Objects;

interface StringOperations3 {

	public String accept(String a);
	
}

public class MethodReferenceExample5 {

	public static void main(String[] args) {

		StringOperations3 op1 = (s) -> s.toUpperCase();
		System.out.println(op1.accept("Diwyang"));
		

		StringOperations3 op2 = String::toUpperCase;
		System.out.println(op2.accept("Diwyang"));
		
	}

}
