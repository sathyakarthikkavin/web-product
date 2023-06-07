package com.ngdeveloper.Prep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[] args) {
		double a = 100;
		double b =0;
		double c = 100/0;
		System.out.println(c);
		LocalDate localDate = LocalDate.of(2015, 4, 4);
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MM/dd/yy")));
		
		//String hello = "sathya";
		//System.out.println(hello.charAt(10));
		
//		try {
//			FileReader file = new FileReader("path");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
