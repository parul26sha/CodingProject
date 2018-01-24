package com.code.codingQuestions;

import java.util.HashMap;
import java.util.Map;

//reverse string maintaining the reverse char position where it is.

public class ReverseStr {
	
	public void reverseStr(String str) {
		
		char [] array=str.toCharArray();
		int start=0;
		int end=(array.length)-1;
		while(start<end) {
			System.out.println("------->");

			if(!(Character.isLetterOrDigit(array[start]))) {
				start++;
				continue;
			}
			if(!(Character.isLetterOrDigit(array[end]))) {
				end--;
				continue;
			}
			
			int temp=array[start];
			array[start]=array[end];
			array[end]=(char) temp;
			start++;
			end--;
		}
		System.out.println(String.valueOf(array));
	}
	//no specialchar
	public void reverseStr2(String str) {
	
		char [] array=str.toCharArray();
		int start=0;
		int end=(array.length)-1;
		while(start<end) {
			char temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;end--;
		}
		
		System.out.println(String.valueOf(array));
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*new ReverseStr().reverseStr("Hi p@aru$l Shar*ma");//am r@ahS$l urap*iH
		String str="345";
		int result =0;
		for(char c:str.toCharArray()) {
			result=(result*10)+(c-'0');
		}
		System.out.println(result*2);
		System.out.println('c'>='a' && 'c'<='z');
		*/
	//if not sorted and num is given 
		/*int [] integer=new int[] {9,3,5,1,3,4};//1,3,4,5,9
		int [] integer2=new int[] {3,5,4,2,3,6};//2,3,4,5,6
		
		
		for(int i =0;i<integer.length;i++) {
			if(integer[i]==4) {
				System.out.println("found it!!");
				break;
			}
			else {
				System.out.println("NotFound!!");
			}
		}*/
		
		
		
	
		new ReverseStr().reverseStr2("rome");
		//emor
		
		
		
	}

}
