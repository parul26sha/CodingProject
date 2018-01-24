package com.code.November;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DuplicateValue {

	public int test() {
		String str="loveleetcode";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i),1);
			}
		}
	for(int i=0;i<str.length();i++) {
		if(map.get(str.charAt(i))==1) {
			return i;
		}
		
	}
	return -1;
		
	}
	
	
	
	public int test2() {//abcabcbb
		
		String s="ababcbmkl";
		List<String> list=new LinkedList<String>();
		StringBuilder str=new StringBuilder("");
		for(int i=0;i<s.length();i++) {
			//System.out.println(str.indexOf(Character.toString(s.charAt(i))));
			if(str.indexOf(Character.toString(s.charAt(i)))<0) {
				str.append(s.charAt(i));
				System.out.println("---->ff"+str);
				
			}
			else {
				System.out.println(str);
				list.add(str.toString());
				str=new StringBuilder(Character.toString(str.charAt(str.length()-1)));
				if(s.charAt(i)!=str.charAt(0)) {
					str.append(s.charAt(i));
				}
			}
			list.add(str.toString());
			
		}
		
		int longest=0;
		for(String st:list) {
			if(st.length()>longest) {
				longest=st.length();
			}
		}
		
		return longest;
}
	
	public static void main(String[] args) {
		int i=new DuplicateValue().test2();
	    	System.out.println(i);
	}
}
