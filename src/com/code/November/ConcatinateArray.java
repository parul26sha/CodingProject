package com.code.November;

public class ConcatinateArray {
	
	public void method1() {
		int a[]= {1,2,3,4};
		int b[]={2,5,6,6,7,8,9};
		int a3[]=new int[a.length+b.length];
		int i=0,j=0;
		int newi=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				a3[newi]=a[i];i++;newi++;
			}
			else{
				a3[newi]=b[j];j++;newi++;
			}
		}
		while(i<a.length) {
			a3[newi]=a[i];i++;newi++;
		}
		while(j<b.length) {
			a3[newi]=b[j];j++;newi++;
		}
		for(Integer m:a3) {
			System.out.println(m);
		}
		
	}
	
	
	public void method2() {
		int a[]= {1,2,3,4,0,0,0};
		int b[]={2,5,6,6,7,8,9};
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
	}

}
