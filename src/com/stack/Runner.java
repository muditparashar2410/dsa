package com.stack;

public class Runner {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
//		s.pop();
		s.print(s.getTop());
		
	}

}
