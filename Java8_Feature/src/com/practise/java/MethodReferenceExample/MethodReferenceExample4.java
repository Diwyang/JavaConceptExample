package com.practise.java.MethodReferenceExample;

import java.util.Objects;

interface StringOperations2 {

	public boolean accept(String a);
	
}

public class MethodReferenceExample4 {

	public static void main(String[] args) {

		StringOperations2 op1 = (s) -> Objects.isNull(s);
		System.out.println(op1.accept("Diwyang"));
		
		System.out.println(op1.accept(null));

		StringOperations2 op2 = Objects::isNull;
		System.out.println(op2.accept("Diwyang"));
		
		System.out.println(op2.accept(null));
	}

}
