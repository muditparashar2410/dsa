package com.question;

public class Rootware {
	static boolean check(char c) {
		if(c=='a' || c=='i' || c=='o' || c=='u' || c=='e') {
			return true;
		}
		return false;
	}
	static void vowel(String s) {
		int count=0;
		for(int i = 1 ; i < s.length()-1;i++) {
			if(check(s.charAt(i-1)) && check(s.charAt(i+1)) && !check(s.charAt(i))){
				count++;
			}
		}
		System.out.println(count);
		for(int i = 1 ; i < s.length()-1;i++) {
			if(check(s.charAt(i-1)) && check(s.charAt(i+1)) && !check(s.charAt(i))){
				System.out.print(i+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		vowel("riverine");
	}

}
