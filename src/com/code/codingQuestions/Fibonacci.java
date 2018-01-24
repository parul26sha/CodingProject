package com.code.codingQuestions;

public class Fibonacci {
	//a. Write a program that prints a fibonaci series that is a sequence of 
	//numbers like 0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or any desired number.

	public static void main(String[] args) {
		int t1=0;
		int t2=1;
		int n=10;
		System.out.print(t1+"+"+t2+"+");
		for(int i=2;i<n;i++) {
			int t3=t1+t2;
			System.out.print(t3+"+");
			t1=t2;
			t2=t3;
		}
		
		
	}

}
