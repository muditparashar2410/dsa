package com.stack;
class Node {
	Node next;
	int data;
	Node (int data){
		this.data = data;
		next =null;
	}
}
public class Stack {
	 private Node top;
	 private int size;
	public  Node getTop() {
		return top;
	}
	boolean Empty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	void push(int data){
		Node node = new Node(data);
		if(top==null) {
			top=node;
			return ;
		}
		node.next=top;
		top=node;
		size++;
	}
	void pop() {
		top = top.next;
		size--;
	}
	int peek() {
		return top.data;
	}
	void print(Node head) {
		Node temp = head;
		while(temp !=null) {
			System.out.println(" | "+temp.data+ " | ");
			temp=temp.next;
		}
	}
}
