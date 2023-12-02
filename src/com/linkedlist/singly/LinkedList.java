package com.linkedlist.singly;

import java.util.Iterator;
import java.util.List;

class LinkedList {
	private Node head;
	private Node tail;
	private int size;

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getSize() {
		return size;
	}

	void insertAtLast(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		tail = node;
		size++;
	}

	Node printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		return head;
	}
	Node makeList(List<Integer> list) {
		Node temp=null;
		Node head = temp.next;
		for (int i = 0; i < list.size(); i++) {
			Node node = new Node(list.get(i));
			if(head==null) {
				head=node;
				tail=node;
			}
			tail.next=node;
			tail=node;
			size++;
		}
		return head;
		
	}
	void insertAtfirst(int data) {
		if(head==null) {
			insertAtLast(data);
			return;
		}
		Node node = new Node(data);
		node.next=head;
		head=node;
		size++;
	}
	

}
