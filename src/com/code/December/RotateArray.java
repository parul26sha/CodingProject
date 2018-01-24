package com.code.December;

import java.util.LinkedList;
import java.util.List;

public class RotateArray {
	//1,2,3,4,5
	public void rotate(int[] arr,int d) {
		List<Integer>list=new LinkedList<Integer>();
		for(int i:arr) {
			list.add(i);
		}
		
		while(d>0) {
			Integer element=list.remove(0);
			list.add(element);
			d--;
		}
		System.out.println(list);	
	}
	
	public void rotate2(int[] arr,int d) {
		
		int arrNew[]=new int[d];
		for(int i=0;i<d;i++) {
			arrNew[i]=arr[i];
		}
		
		
		int index1=0;
		int index2=d;
		while(index2<arr.length) {
			arr[index1]=arr[index2];
			index1++;index2++;
		}
		
		for(int i=arr.length-d,j=0;i<arr.length&&j<arrNew.length;i++,j++) {
			arr[i]=arrNew[j];
		}
		
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		new RotateArray().rotate(new int[]{1,2,3,4,5},2);
		new RotateArray().rotate2(new int[]{1,2,3,4,5},2);
		
	}
}
