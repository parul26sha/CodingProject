package com.code.codingQuestions;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public boolean isAnagram(String word,String anagram) {
		if(word.length()!=anagram.length()){
			return false;
		}
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:word.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		
		for(char c:anagram.toCharArray()) {
			if(map.containsKey(c)&&map.get(c)>=1) {
				if(map.get(c)==1) {
					map.remove(c);	
				}
				else{
					map.put(c, map.get(c)-1);
				}
			}
			
			
			else {
				return false;
			}
		}
		
		return map.isEmpty();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Anagram().isAnagram("icseman","cinesma"));
		
	}

}
