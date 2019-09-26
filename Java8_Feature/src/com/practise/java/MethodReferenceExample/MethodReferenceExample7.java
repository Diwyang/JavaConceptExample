package com.practise.java.MethodReferenceExample;

import java.util.Objects;

interface StringOperations4 {

	public String accept(String a,String b);
	
}

public class MethodReferenceExample7 {

	public static void main(String[] args) {

		StringOperations4 op1 = (s1,s2) -> s1.concat(s2);
		System.out.println(op1.accept("Diwyang","  Jain"));
		

		StringOperations4 op2 = String::concat;
		System.out.println(op2.accept("Diwyang","  Jain"));
		
	}

}
