package com.sunbeam;

public class BSTree {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value)
		{
			data=value;
			left=right=null;
		}
	}
	private Node root;
	public BSTree()
	{
		root=null;
	}
	public boolean isEmpty()
	{
		return root==null;
	}
	public void deleteAll() {
		root=null;
	}
	
	public void addNode(int value)
	{
		// create node for given data 
		Node newnode= new Node(value);
		// if BSTree is empty
		if(isEmpty())
			// add newnode into root self
			root=newnode;
		// if BSTree is not empty 
		else 
		{
			// create trav referenence ans start at root 
			Node trav=root;
			// if value is less than current node data 
			while(true)
			{
			if(value < trav.data)
			{
				// if left of current data is empty 
				if(trav.left==null)
				{
					// add newnode into left of current data 
					trav.left=newnode;
					break;
				}else 
				{
					trav=trav.left;
				}
			}// if value is greater or equal than current node data 
			else 
			{
				// if right of current node is empty 
				if(trav.right==null)
				{
					trav.right=newnode;
					break;
				}
				// if right of current node is not empty 
				else 
				{
					trav=trav.right;
				
				}
				}
			}
		}
			
	}
	public int height(Node trav)
	{
		// if left or right sub tree is absent 
		if(trav==null)
		{
			return -1;
		}
		// 1. find height of left subtree
		int hl=height(trav.left);
		// 2. find height of right subtree
		int hr=height(trav.right);
		// 3. find max height 
		int max=Integer.max(hl,hr);
		// add one into max height(return)
		return max+1;
	}
	public int height() {
		return height(root);
	}public void inorder(Node trav) {
		if(trav == null)
			return;		
		inorder(trav.left);//L
		System.out.print(" " + trav.data);//V
		inorder(trav.right);//R	
	}
	
	public void inorder() {
		System.out.print("Inorder : ");
		inorder(root);
		System.out.println("");
	}

}
