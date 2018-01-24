package com.code.codingQuestions;

public class SelectionSort {

	public void sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
			
		}
		
	
		for(int a:arr) {
			System.out.println(a);
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			new SelectionSort().sort(new int[] {3,5,1,6,9,7});//
			}
}


