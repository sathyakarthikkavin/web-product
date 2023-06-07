package com.ngdeveloper.Todo.helper;

import org.springframework.stereotype.Service;

@Service
public class TaxCalculationHelper {

	public long getTax(long monthlySalary) {
		long yearlySalary = monthlySalary*12;
		if(yearlySalary > 1000000) {
			return (yearlySalary * 8)/100;
		}
		return 0L;
	}
}
