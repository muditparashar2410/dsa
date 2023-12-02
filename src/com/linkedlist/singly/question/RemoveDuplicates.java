package com.linkedlist.singly;

import java.util.HashSet;

class RemoveDuplicates {
     Node removeDuplicates(Node head)
    {
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        Node prev;
        while(temp!=null){
            prev = temp;
            if(set.contains(temp.data)){
                if(temp.next==null){
                    temp=null;
                    return head;
                }
                temp.data = temp.next.data;
                temp.next=temp.next.next;
            }else{
                set.add(temp.data);
                temp=temp.next;
            }
        }
        return head;
    }
}
