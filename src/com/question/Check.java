package com.question;

import java.util.Stack;

interface A {
	abstract void m();
}
class Foo {
	static String text = "Foo";
}
class Bar extends Foo{
	void printText() {
		
	}
}
public class Check {
	
	public static void main(String[] args) {
			System.out.print(Bar.text);
		}
	}

