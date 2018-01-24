package com.code.November;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	
	//2)Reverse string by using List Interface
	
	public void reverse() {
		
		System.out.println("Enter a string::");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		
		ArrayList<Character> chars = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
		  chars.add(c);
		}
		for(int i=0,j=str.length()-1;i<str.length()-1 && j>=i;i++,j--) {
			char temp=chars.get(i);
			chars.set(i, chars.get(j));
			chars.set(j, temp);
		}
		System.out.println(chars.toString());
		
	}
	public void reverseII(String s) {
	//Reverse string by StringBuilder class
	
	StringBuilder builder=new StringBuilder(s).reverse();
	String str2=builder.toString();
	System.out.println(str2);
	
	}
	public static void main(String[] args) {
		new ReverseString().reverseII("hello");
	}
	
	
	
	
}
