package com.code.November;

public class ApSeries {
	
	
	public void printSum() {
		// 3 + 8 + 13 + 18 + 23 + 28 + 33
		int sum=0;
		for(int i=3;i<=33;i+=5) {
			sum+=i;
		}
		System.out.println("Sum::"+sum);
	}

	public static void main(String[] args) {
		
		//new ApSeries().printSum();
		
	
	}
	
	
}
