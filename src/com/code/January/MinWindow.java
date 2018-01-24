package com.code.January;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {
	public String window(String str,String pattern) {
		if(pattern.length()>str.length()) {
			return pattern+" not in the string "+str;
		}
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<pattern.length();i++) {	
			if(map.containsKey(pattern.charAt(i))) {
				map.put(pattern.charAt(i),map.get(pattern.charAt(i))+1);
			}
			else {
				map.put(pattern.charAt(i),+1);
			}
		}
		System.out.println(map);
		String newStr="";
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i))&&map.get(str.charAt(i))>0) {
				for(int j=i;j<str.length();j++) {
					if(map.containsKey(str.charAt(j))&&map.get(str.charAt(j))>0) {
						newStr+=str.charAt(j);
						map.put(str.charAt(j),map.get(str.charAt(j))-1);
						System.out.println(newStr);
					}
					else if(!map.containsKey(str.charAt(j))) {
						newStr+=str.charAt(j);
					}
					else {
						break;
					}
				}		
			}
		}
		
		return newStr;
	}
	public static void main(String[] args) {
		System.out.println("---->>.");
		System.out.println(new MinWindow().window("geeksforgeeks","ork")) ;
	}

}


