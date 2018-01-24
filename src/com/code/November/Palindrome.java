package com.code.November;

import java.util.Scanner;

public class Palindrome {
	//1) To check the given string is palindrome or not
	//aabaa

	public boolean check() {
		
		System.out.println("Enter a string::");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		
		for(int i=0,j=str.length()-1;i<=str.length()-1 && j>=i;i++,j--) {
			if(!(str.charAt(i)==str.charAt(j))) {
				return false;
			}//kayak
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("the string you entered is a Palindrome::"+new Palindrome().check());
	}
	
}
