package com.code.November;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Strtok {
	
	public void words() {
		Scanner scanner =new Scanner(System.in);
		String str=scanner.nextLine();
		List<String> words=new ArrayList<String>();
		String newStr="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				newStr+=(str.charAt(i));
			}
			else {
				words.add(newStr);
				newStr="";
			}
		}
		if(newStr!="") {
			words.add(newStr);
		}
		System.out.println(words);
	}
	
	public static void main(String[] args) {
		String str="hello how are you";
		String[] arr=str.split(" ");
		for(String s:arr) {
			System.out.println(s);
		}
		//new Strtok().words(); 
	}
}
