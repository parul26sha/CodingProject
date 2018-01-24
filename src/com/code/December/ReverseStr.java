package com.code.December;

public class ReverseStr {

	public void reverse(String str) {
		char[] arr=str.toCharArray();
		for(int i=0,j=str.length()-1;i<str.length()&& j>=i;i++,j--) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		System.out.println(String.valueOf(arr));
	}
	
	public static void main(String[] args) {
		new ReverseStr().reverse("lurap");
	}
	
}
