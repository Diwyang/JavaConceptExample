package com.practise.java.consumerInterfaceExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer>{
	public void accept(Integer i) {
		System.out.println("Value is "+i);
	}
}
public class ConsumerInterfaceExample {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(4,5,6,7,8,9);
		Consumer<Integer> c = new ConsImpl();
		values.forEach(c);

	}

}
