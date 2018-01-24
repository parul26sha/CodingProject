package com.code.January;

import java.io.BufferedReader;
import java.io.FileReader;

public class CamelCase {

		    public static void method1() {
		      String d="hello how are you";
		      String[] str=d.split(" ");
		      for(int i=0;i<str.length;i++){
		       str[i]=str[i].replace(str[i].charAt(0),Character.toUpperCase(str[i].charAt(0)));
		      }
		    StringBuffer buffer=new StringBuffer();
		    for(int i=0;i<str.length;i++){
		        if(i!=str.length-1){
		        buffer.append(str[i]);
		        buffer.append(" ");
		        }
		        else{
		             buffer.append(str[i]);
		        }
		        
		    }
		    
		    System.out.print(buffer.toString());
		    
		    }
		   
		    
		    public static void main(String args[]) {
		    	System.out.println((String.valueOf(19.0)));
		    	}
}
