package com.ngdeveloper.Prep;

import java.util.Arrays;
import java.util.List;

public class Square {
	public static void main(String args[])
	{
		List<Integer> numbers=Arrays.asList(10,20,30,40,50);
		
		double avg=numbers.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		
	

}
}
