package com.code.December;

public class FindKthChar {
//Find k’th character of decrypted string
	
	//a2b2c3
	//ab4c2ed3
	public void test(String str,int k) {
		int index=0;
		String strNew="";
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)) ) {
				index+=( strNew.length()*Character.getNumericValue(str.charAt(i)));
				strNew="";
			}
			else if(Character.isLetter(str.charAt(i)) && index<k) {
				strNew+=str.charAt(i);
			}
			if(index==k) {
				
			}
						
			
		}
		
	}
	
}
