package com.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	Node left;
	Node right;
	int data;

	public Node() {
		super();
	}

	public Node(int data) {
		super();
		this.left = null;
		this.right = null;
		this.data = data;
	}

}

public class Tree {
	int idx=-1;
	public Node buildtree(int nodes[]) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
		Node newNode = new Node(nodes[idx]);
		newNode.left = buildtree(nodes);
		newNode.right=buildtree(nodes);
		return newNode;
		 }
	public void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	};
	public void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	public void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public void levelorder(Node root) {
		Queue<Node> que = new LinkedList<>();
		que.add(root);
		que.add(null);
		while(!que.isEmpty()) {
			Node currNode = que.remove();
			if(currNode ==null) {
				System.out.println();
				if(que.isEmpty()) {
					break;
				}else {
					que.add(null);	
				}
			}else {
				System.out.print(currNode.data+" ");
				if(currNode.left!=null) {
					que.add(currNode.left);
				}
				if(currNode.right!=null) {
					que.add(currNode.right);
				}
			}
		}
	}
	int count(Node root) {
		if(root==null) {
			return 0;
		}
		int left= count(root.left) ;
		int right = count(root.right);
		return left+right+1;
	}
	int sum(Node root) {
	if(root==null) {
		return 0;
	}
	return sum(root.left)+sum(root.right)+root.data;
	}
	int height(Node root) {
		if(root==null) {
			return 0;
		}
		int left = height(root.left);
		int right = height(root.right);
		return Math.max(left, right)+1;
	}
	
	int diameter(Node root) {
//		O(N^2)
		if(root==null) {
			return 0; 
		}
		int leftd= diameter(root.left);
		int rightd =diameter(root.right);
		int rootd = height(root.left) + height(root.right)+1;
		return Math.max(rootd,Math.max(rightd, leftd));
	}
//	with O(N) complexity
	
	



 












}
