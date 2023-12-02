package com.tree;

public class Runner {

	public static void main(String[] args) {
		int nodes[] = {1, 2, 4 ,-1 ,-1 ,5 ,-1 ,-1 ,3 ,-1 ,6 ,-1, -1};
		Tree tree = new Tree();
		Node root = tree.buildtree(nodes);
		System.out.println(tree.diameter(root));
	}

}