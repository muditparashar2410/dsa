package com.linkedlist.singly;

import com.linkedlist.singly.RemoveDuplicates;

public class Runner {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.insertAtLast(30);
		list.insertAtLast(10);
		list.insertAtLast(10);
		list.insertAtLast(40);
		list.insertAtLast(40);

		RemoveDuplicates r = new RemoveDuplicates();
		r.removeDuplicates(list.getHead());



		list.printList(list.getHead());
	}

}
