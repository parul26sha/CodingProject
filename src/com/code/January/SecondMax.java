package com.code.January;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecondMax {
	public void maxChar(String str) {
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i),1);
			}
		}
		System.out.println(map);
		int highest=0;
		char highestChar=0;
		int secondHighest=0;
		char sHighestChar=0;
		for( Map.Entry<Character,Integer> e:map.entrySet()) {
			
			if(e.getValue()>highest){
				
				sHighestChar=highestChar;
				secondHighest=highest;
				highest=e.getValue();
				highestChar=e.getKey();
				}
			else if (e.getValue()<highest && e.getValue()>secondHighest){
				
				sHighestChar=e.getKey();	
			}
		}
	
		System.out.println(sHighestChar);
		
	}

	
	
	public static void main(String[] args) {
		new SecondMax().maxChar("aasadssdccccsca");
	}
}
