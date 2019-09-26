package com.practise.java.MethodReferenceExample;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample6 {

	private static final List<String> list = new ArrayList<>();
	public static void main(String[] args) {

		StringOperations op1 = 	s -> list.add(s);
		
		op1.accept("diwyang");
		op1.accept("Santosh");
		
		System.out.println(list);
		
		op1 = list::add;
		op1.accept("gajendra");
		op1.accept("gagan");
		
		System.out.println(list);
		
	}

}
