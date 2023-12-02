package com.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_Impl {

	public static void main(String[] args) {
//		Queue<Integer> q =new LinkedList<>();
		Queue<Integer> q =new ArrayDeque<>();
		Stack<Integer> stack = new Stack<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
//		for(int i = 0 ; i <3 ; i++) {
//			stack.push(q.remove());
//		}
//		for(int i = 0 ; i < 3 ; i++) {
//			q.add(stack.pop());
//		}
		for (Integer integer : q) {
			System.out.print(integer+" ");
		}
	}

}
