package com.code.November;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class removeVowels {
	
	//helloHowareyou
	public void printWithoutVowel() {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str1;
		try {
			str1 = reader.readLine();
			for(int i=0;i<str1.length();i++) {
			//	if(str1.charAt(i))
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		public static void main(String[] args) {
			
		//new removeVowels().printWithoutVowel("helloHHOWowareyou");
		//System.out.println("helloHHOWowareyou".replaceAll("[aeiouAEIOU]", ""));
		
	}

}
