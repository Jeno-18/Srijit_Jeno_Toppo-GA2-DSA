package com.greatLearning.GroupAssignment_2.Question_2;

import java.util.*;

public class Driver {
	static Node root;

	public static void main(String[] args) {
		BinarySearchTree BST=new BinarySearchTree();
		RightSkewedTree RST=new RightSkewedTree();
		Scanner in=new Scanner(System.in);

		while(true) {
			System.out.println("Enter element for the binary tree(Enter 0 to stop input) :");
			int x=in.nextInt();
			if(x==0)
				break;
			root=BST.insert(x, root);
		}
		in.close();

		Node tempRoot=root;
		RST.conversionToRightSkewedTree(tempRoot);

		System.out.println("New Right Skewed Binary Tree :");
		RST.displayRST();

	}

}
