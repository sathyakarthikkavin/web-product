package com.ngdeveloper.Todo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class TestObjects {

	public List<Object[]> getProductDetails(){
		List<Object[]> productsObjList = new ArrayList<>();
		Object[] obj1 = new Object[5];
		obj1[0] = "Poco M3";
		obj1[1] = BigInteger.valueOf(100);
		obj1[2] = "Electronics";
		obj1[3] = "Ajio";
		obj1[4] = "Admitad";		
		
		Object[] obj2 = new Object[5];
		obj2[0] = "Poco M4";
		obj2[1] = BigInteger.valueOf(700);
		obj2[2] = "Electronics";
		obj2[3] = "Flipkart";
		obj2[4] = "Admitad";
		productsObjList.add(obj1);
		productsObjList.add(obj2);
		return productsObjList;
	}
	
	public List<Object[]> getProductDetailsCuelinks(){
		List<Object[]> productsObjList = new ArrayList<>();
		 		
		
		Object[] obj2 = new Object[5];
		obj2[0] = "Poco M4";
		obj2[1] = BigInteger.valueOf(700);
		obj2[2] = "Electronics";
		obj2[3] = "Flipkart";
		obj2[4] = "Cuelinks";		
		productsObjList.add(obj2);
		return productsObjList;
	}
}
