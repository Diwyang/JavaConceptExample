package org.dj.study.functionalinterface.supplier.example;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Double> random = Math::random;
		
		System.out.println(random.get());
	}
}
