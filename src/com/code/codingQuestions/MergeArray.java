package com.code.codingQuestions;

public class MergeArray {
	public void merge(int[] a,int []b) {
		
		int alength=a.length;
		int blength=b.length;
		int []c=new int[alength+blength];
		int i=0,j=0,k=0;
		
		while(i<alength&&j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else {
				c[k]=b[j];
				k++;j++;
			}
		}
		
		while(i<a.length) {
			c[k]=a[i];
			i++;k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;k++;
		}
		
		
		for(int arr:c) {
			System.out.print(arr);
		}
		
	}
	
	public static void main(String[] args) {
		new MergeArray().merge(new int []{1, 3, 5, 7},new int[]  {2, 4, 6, 8});
										//	1,2,3,3,4,5,5,6,7,8,9
		}
}
