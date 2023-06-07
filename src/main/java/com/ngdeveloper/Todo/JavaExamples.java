package com.ngdeveloper.Todo;

import java.util.ArrayList;

public class JavaExamples {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.clear();
		arrayList.add(30);
		
		//arrayList.add(1,25);
		System.out.println(arrayList);
		
		int counter = 0;
		for(Integer val: arrayList) {
			counter++;
		}
		
		// arraylist -> if we have value -> print Yes
		// if you dont have value -> print no
		if(arrayList!=null && arrayList.size()==3) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		if(counter==3) {
			System.out.println("Yes");			
		}else {
			System.out.println("No");
		}
	}

}
