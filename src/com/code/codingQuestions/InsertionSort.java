package com.code.codingQuestions;

public class InsertionSort {

	public void sort(int[] arr) {
		int temp;
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		}
		for(int a:arr) {
			System.out.println(a);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertionSort().sort(new int[] {3,5,1,6,9,7});//1,3,5,6,9,7
	}

}
