package com.code.December;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {
	
	//Return maximum occurring character in an input string
	public void test(String str) {
		
		
		Map<Character,Integer> map =new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i),1);
			}
			
		}
		int max=0;
		char ch = 0;
		for(char c:map.keySet()) {
			if(map.get(c)>max) {
				max=map.get(c);
				ch=c;
			}
		}
		System.out.println("The most Occuring char is ::"+ ch +". It has occured "+max+" times");
		
	}
	
	
	public void getMaxOccuringChar(String str)
    {
		final int ASCII_NUM=256;
		int count[]=new int[ASCII_NUM];
		
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		
		int max=-1;
		char ch=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(count[str.charAt(i)]>max) {
				max=count[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		
		System.out.println("Max occuring char is "+ch );
		
		
    }
	
	
	
	public static void main(String[] args) {
		
		//new MaxOccuringChar().test("llololl");
		new MaxOccuringChar().getMaxOccuringChar("cbbbbccc");
	}

}
