package com.practise.java.MethodReferenceExample;

interface Parser{
	String parse(String s);
}

class StringParser{
	public String convert(String s) {
		if(s.length() <= 10) {
			s = s.toUpperCase();
		} else {
			s= s.toLowerCase();
		}
		return s;
	}
}

class MyPrinter{
	public void print(String s, Parser p) {
		s = p.parse(s);
		System.out.println(s);
	}
}

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		StringParser sp = new StringParser();
		String s = "Diwyang Jain";
		MyPrinter mp = new MyPrinter();
		mp.print(s, (sp::convert));
		
		s = "Diwyang";
		mp.print(s, (sp::convert));
	}

}
