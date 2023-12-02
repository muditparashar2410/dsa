package com.recursion;

public class Recursion {
	static void fibo(int a , int b ,int n) {
	if(n==0) {
		return;
	}
		int c = a+b;
	System.out.println(c);
	fibo(b,c,n-1);
	}
	
	
	
	public static void main(String[] args) {
	
	
	}

}
