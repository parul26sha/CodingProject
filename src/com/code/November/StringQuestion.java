package com.code.November;

public class StringQuestion {

	
	//write any program using Equals and " ==" in string
	
	
	public void test() {
		
		if("hello".equals("hello")) {
			System.out.println("Using \".equals method\"");
		}
		if("hello"=="hello") {
			System.out.println("Using \"== method\"");
		}
	}
	public static void main(String[] args) {
		new StringQuestion().test();
	}
	
}
