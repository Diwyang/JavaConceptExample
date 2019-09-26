

package com.practise.java.lambdaExample.collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorExample2 {

	public static void main(String[] args) {

		String s1 ="ABCD";
		String s2 = "CDEF";
		
		for(int i=0;i<s2.length();i++) {
			if(!s1.contains(""+s2.charAt(i))) {
				System.out.println("kk : "+s2.charAt(i));
			}
		}
		
		List sl1 = Arrays.asList(s1);
		List sl2 = Arrays.asList(s2);
		
//				System.out.println((sl1.stream().filter(sl2 -> dl2.contains(c)).collect(collector));
				
	}

}
