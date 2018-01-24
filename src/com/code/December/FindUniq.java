package com.code.December;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindUniq {
	public void getUnique(String str) {
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i),1);
			}
		}
	for(Character c :map.keySet()) {
		if(map.get(c)==1) {
			System.out.println(c);
		}
	}
	
}
	
	public void getUnique2(int[] arr) {
		List<Integer>list=new LinkedList<Integer>();		
		
		for(int i=0;i<arr.length;i++){
			boolean unique=true;	
			for(int j=0;j<i;j++) {
					if(arr[i]==arr[j]){
						System.out.println(i +" ::"+j);
						unique=false;
						break;	
				}
			
			}
			if(unique==true) {
				list.add(arr[i]);
			}
		}
		
		System.out.println( list);
	}
		
	
	public static void main(String[] args) {
		new FindUniq().getUnique("hlloi");
		new FindUniq().getUnique2(new int[] {2,3,4,5,3,2,6,7,9,4});
	}

}