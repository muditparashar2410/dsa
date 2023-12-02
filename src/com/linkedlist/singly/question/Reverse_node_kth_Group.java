package com.linkedlist.singly;

//1 2 3 4
public class Reverse_node_kth_Group {
	
	void reverse(Node start , Node end) {
	        Node prev = null;
			Node curr=start;
			while(prev!=end) {
			Node temp = curr.next;
	        curr.next=prev;
	        prev=curr;
	        curr=temp;
			}
	}
	
	
	
	 Node reverseKGroup(Node head, int k) {
		if(head==null || head.next==null || k==1) {
			return head;
		}
		Node start = head;
		Node end = head;
		for(int i = 0 ; i < k-1 ; i++) {
			end=end.next;
			if(end==null) {
				return head;
			}
		}
		Node nexthead=reverseKGroup(end.next,k);
		reverse(start,end);
		start.next=nexthead;
		return end;
	}
        
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtLast(1);
		list.insertAtLast(2);
		list.insertAtLast(3);
		list.insertAtLast(4);
		list.insertAtLast(5);
		list.insertAtLast(6);
		list.insertAtLast(7);
		list.insertAtLast(8);
		Reverse_node_kth_Group rev = new Reverse_node_kth_Group(); 		list.printList(rev.reverseKGroup(list.getHead(), 3));
	}

}
