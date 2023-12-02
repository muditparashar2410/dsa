package com.linkedlist.singly;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }

    public Node() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }
}
