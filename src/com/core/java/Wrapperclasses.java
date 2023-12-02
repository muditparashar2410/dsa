package com.core.java;

import java.util.ArrayList;

public class Wrapperclasses {

	public static void main(String[] args) {
		Integer a =5;
		Integer b = 6;
		swap(5,6);
		System.out.println("a-"+a+", b-"+b);

	}

	private static void swap(Integer a, Integer b) {
		int temp = a;
		a= b;
		b=temp;
	}

}
