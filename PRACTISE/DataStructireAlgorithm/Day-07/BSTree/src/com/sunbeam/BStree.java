package com.sunbeam;

public class BStree {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value)
		{
			data=value;
		}
	}
	private Node root;
	public BStree()
	{
		root=null;
	}
	public boolean isEmpty()
	{
		return root==null;
	}
	public void addNode(int value)
	{
		Node newnode= new Node(value);
		if(root==null)
		{
			root=newnode;
		}else
		{	
		Node trav=root;
		while(true)
		{
			if(value<trav.data)
			{
				if(trav.left==null) //if null
				{
					trav.left=newnode;
					break;
				}else 
				{
					trav=trav.left;
				}
			}else
			{
				if(trav.right==null)
				{
					trav.right=newnode;
					break;
				}else 
				{
					trav=trav.right;
				}
			}
			}
		}
		
	}
	
	// preorder 
	
	public void preorder(Node trav)
	{
		if(trav==null)
		{
			return;
		}
		System.out.print(" "+ trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder()
	{
		System.out.println("Preorder");
		preorder(root);
	}
	public void inorder(Node trav)
	{
		if(trav==null)
			return;
		inorder(trav.left);
		System.out.println(" "+ trav.data);
		inorder(trav.right);
		
	}
	public void inorder()
	{
		System.out.println("Inorder : ");
		inorder(root);
	}
	public Node binarysearch(int key)
	{
		Node trav=root;
		while(trav!=null)
		{
			if(key==trav.data)
				return trav;
			else if (key<trav.data)
			{
				trav=trav.left;
			}else if (key>trav.data)
			{
				trav=trav.right;
			}
		}
		return trav;
	}
	
	


}
