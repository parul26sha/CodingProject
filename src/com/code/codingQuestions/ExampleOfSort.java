package com.code.codingQuestions;

public class ExampleOfSort {
	
	void sortBySwap(int arr[], int n)
	{
	    // Traverse the given array from rightmost side
	    for (int i = n-1; i > 0; i--)
	    {
	        // Check if arr[i] is not in order
	        if (arr[i] < arr[i-1])
	        {
	            // Find the other element to be
	            // swapped with arr[i]
	            int j = i-1;
	            while (j>=0 && arr[i] < arr[j])
	                j--;
	  
	            swap(arr[i], arr[j+1]);
	            break;
	        }
	        
	    }
	    for(int a :arr) {
	    	System.out.println(a);
	    }
	}
	

	public void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
	}
	
	public static void main(String[] args) {
		new ExampleOfSort().sortBySwap(new int[] {10, 30, 20, 40, 50, 60, 70},7);
		
	}
}
