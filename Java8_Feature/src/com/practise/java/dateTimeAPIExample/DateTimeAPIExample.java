package com.practise.java.dateTimeAPIExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeAPIExample {

	public static void main(String[] args) {

		LocalDate d =LocalDate.now();
		System.out.println("Date is  "+ d);
		
		d =LocalDate.of(1981,Month.JUNE,25);
		System.out.println("Date is  "+ d);
		
		LocalTime t = LocalTime.now();
		System.out.println("Time is  "+ t);
		
		t = LocalTime.of(12,30,30,999);
		System.out.println("Time is  "+ t);
		
		t = LocalTime.now(ZoneId.systemDefault());
		System.out.println("Time is  "+ t);
		
		LocalDateTime ld = LocalDateTime.now();
		System.out.println("Time is  "+ ld);
	}

}
