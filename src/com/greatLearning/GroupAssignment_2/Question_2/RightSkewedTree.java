package com.greatLearning.GroupAssignment_2.Question_2;

public class RightSkewedTree 
{
	static Node rst=null;

	void conversionToRightSkewedTree(Node tempRoot)
	{
		if(tempRoot==null)
			return;

		conversionToRightSkewedTree(tempRoot.left);
		rst=rstInsert(tempRoot.data);
		conversionToRightSkewedTree(tempRoot.right);
	}

	static Node rstInsert(int data)
	{
		Node newNode=new Node(data);
		Node currentNode=rst;
		Node tempNode=null;

		if(rst==null) {
			return newNode;
		}

		while(currentNode!=null) {	
			tempNode=currentNode;
			currentNode=currentNode.right;
		}

		tempNode.right=newNode;
		return rst;

	}

	void displayRST()
	{
		Node newTempNode=rst;
		while(newTempNode.right!=null)
		{
			System.out.print(newTempNode.data+" ");
			newTempNode=newTempNode.right;
		}
		System.out.print(newTempNode.data+" ");
	}

}
