package com.core.java;

class A{
	void m1() {
		System.out.println("inside m1");
	}
}
class B extends A {
	void m1() {
		System.out.println("inside m1 bt in class b");
	}
}
public class Polymorph {

	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}

}
