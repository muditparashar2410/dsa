package com.core.java;

public class Reverse_num {
	static int reverse(int n) {
		int newnum=0;
		while(n!=0) {
			newnum =newnum*10+ n%10;
			n=n/10;
		}
		return newnum;
	}
	public static void main(String[] args) {
//		System.out.println(reverse(1234));
		System.out.println(18%10);
	}

}
