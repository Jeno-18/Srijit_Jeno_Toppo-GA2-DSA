package com.greatLearning.GroupAssignment_2.Question_2;



public class BinarySearchTree 
{


	Node insert(int value, Node root)
	{

		Node newNode=new Node(value);
		Node currentNode=root;
		Node tempNode=null;

		if(root==null)
		{
			return newNode;
		}

		while(currentNode!=null) {
			if(value<currentNode.data)
			{
				tempNode=currentNode;
				currentNode=currentNode.left;
			}
			else if(value>currentNode.data)
			{
				tempNode=currentNode;
				currentNode=currentNode.right;
			}
			else
			{
				System.out.println("Duplicate value");
				return root;
			}

		}

		if(value<tempNode.data)
		{
			tempNode.left=newNode;
			return root;
		}
		else
		{
			tempNode.right=newNode;
			return root;
		}

	}

}
