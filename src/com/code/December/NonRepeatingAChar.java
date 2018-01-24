package com.code.December;

import java.util.Map;
import java.util.TreeMap;

public class NonRepeatingAChar {
//K’th Non-repeating Character
	//geeksforgeeks
	public void nonRepeating(String str,int numChar) {
		char c=0;
		Map <Character,Integer> map=new TreeMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i),1);
			}	
		}
		for(int i=0;i<str.length()&& numChar>=1;i++) {
			if(map.get(str.charAt(i))==1) {
				System.out.println("---->");
				c=str.charAt(i);
				numChar--;
			}
		}
		System.out.println("======>>>"+c);	
	}
	public static void main(String[] args) {
		
		new NonRepeatingAChar().nonRepeating("geeksforgeeks",1);
	}
}