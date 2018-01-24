package com.code.codingQuestions;

public class SubString {
	
	public boolean  subStrPresent(String word,String subString) {
		
		return word.toLowerCase().contains(subString.toLowerCase());
		
	}
	
	public void   replaceSubStr1(String word,String subString,String replace ) {
		System.out.println(word.replace(subString,replace));
		
	}
	
	public static void main(String[] args) {
		System.out.println(new SubString().subStrPresent("hello parul how are you ",""));
		//new SubString().replaceSubStr("hello uma how are you ","uma","parul");
		
	}

}
