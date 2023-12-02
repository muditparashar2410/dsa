package com.algorithm;

import java.util.Arrays;

public class SlidingWindowTechnique {
		
	public static void main(String[] args) {
	String a= "CATD";
	String b= "TCAQ";
	char arr1 [] = a.toCharArray();
	char arr2 [] = b.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	if(arr1.length!=arr2.length) {
		System.out.println("Not a Anagram");
	}
	
	if(Arrays.equals(arr1, arr2)) {
		System.out.println("anagram");
	}else {
		System.out.println("Not a anagram");
	}
	
	
	

	}

}
