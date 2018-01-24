package com.code.December;

import java.util.HashMap;
import java.util.Map;

public class SubString {
	
	//Given two strings string1 and string2, find the smallest substring in string1 containing all characters of string2 efficiently.

	public void test(String str1,String str2) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str2.length();i++) {
			
			if(map.containsKey(str2.charAt(i))) {
				map.put(str2.charAt(i),map.get(str2.charAt(i))+1);
			}
			else {
				map.put(str2.charAt(i),1);
			}
		}
		
		
		String newStr="";
		int count=str2.length();
		for(int i=0;i<str1.length()&&count>0;i++) {
			if( map.containsKey(str1.charAt(i)) && map.get(str1.charAt(i))>=1){
				newStr+=str1.charAt(i);
				map.put(str1.charAt(i),(map.get(str1.charAt(i)))-1);
				count--;
			}
			else {
				newStr+=str1.charAt(i);
			}
		}
		System.out.println(newStr);		

	}
	public static void main(String[] args) {
		new SubString().test("this is a test string","tist");
	}
}