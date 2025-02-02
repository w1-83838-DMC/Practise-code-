package com.sunbeam;

public class BsTree {
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
	
	private Node root;// root node 
	public BsTree() {
		root=null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void addNode(int value)
	{
		// create node for given data
		Node newnode= new Node(value);
		// if Bstree is Empty
		if(isEmpty())
			root=newnode;
		else 
		{
		// if Bstree is not empty 
		// create trav reference and start at root 
		Node trav=root;
		while(true)
		{
	
		// if value is less than current node data 
			if(value <trav.data) {
				//if left of current node is empty
				if(trav.left==null)
				{
					// addnewnode into left of current node 
					trav.left=newnode;
					break;
				}// if left of current node is empty 
				else 
				{
					trav=trav.left;
				}
				
			// if value is greater or equal to than current node 
			}else 
			{
				// if right of current node is empty
				if(trav.right==null)
				{
					// add new node into right of current node
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
	
	public void preorder(Node trav)
	{
		if(trav==null)
			return;
		System.out.print(" "+ trav.data);
		preorder(trav.left);  // L
		preorder(trav.right); // R
	}
	public void preorder() {
		System.out.print("Preorder : ");
		preorder(root);
		System.out.println("");
	}
	public void inorder(Node trav)
	{	
		if(trav==null)
			return;
		inorder(trav.left);
		System.out.print(" "+ trav.data);
		inorder(trav.right);
	}
	public void inorder()
	{
		System.out.print("inorder : ");
		inorder(root);
		System.out.println("");
	}
	
	
	public void deletAll()
	{
		root=null;
	}
	// Binary search
	// start from root 
	// if key is equal to current data //return current node 
	// if key is less than current data search key into left of current node 
	// if key is greater than current data search key into right of current node 
	// repeat step 2 to 4 till leaf node
	
	public Node binarySearch(int key)
	{
		// 1.start from root 
		Node trav= root;
		while(trav!=null)
		{
			// if key is equal to current data 
			if(key == trav.data)
			{
				return trav;
			}// if key is less than current data 
			else if (key<trav.data)
			{
				// search key into left of current node 
				trav=trav.left;
			}else {// if key is greater than current data
				trav=trav.right;
			}
		}
		return trav;
	}
	public Node[] binarySearchWithParent(int key)
	{
		// start from root
		Node trav= root;
		Node parent = null;
		while(trav!=null)
		{
			// if key is equal to current data 
			if(key==trav.data)
				break;
			parent=trav;
			if (key<trav.data)
			{
				//search key into left of current node 
				trav= trav.left;
			}else 
			{
				// search key into right of current node 
				trav=trav.right;
			}
		}
		if(trav == null)
			parent=null;
		// 6. if key is not found 
		return new Node[] {trav,parent};
	}
	public void deleteNode(int key)
	{
		//1. search node to be deleted along with its parent
		Node arr[]=binarySearchWithParent(key);
		// arr[0]- node to be deleted
		// arr[1]- parent of node to be deleted 
		
		Node temp= arr[0],parent=arr[1];
		// if node id not found
		if(temp == null)
			return;
		
		// if node is not found 
		// if node is having two child 
		if(temp.left!=null && temp.right!=null)
		{
			// find predeccessor of temp 
			Node pred= temp.left;
			parent=temp;
			while(pred.right!=null)
			{
				parent=pred;
				pred=pred.right;
			}
			// b. replaced temp's data by pred data 
			temp.data=pred.data;
			// c. delete predecessor
			temp=pred;
		}
		
		// if node is having single child(right) -left child is not present 
		
		if(temp.left==null)
		{
			if(temp==root) // Delete Node which has single child (right child )
				root=temp.right;
			else if(temp==parent.left)
				parent.left=temp.right;
			else if(temp==parent.right)
				parent=temp.right;
		}else 
			if(temp==root) // Delete Node which has single child (left child)
				root=temp.left;
			else if (temp==parent.left)
				parent=temp.left;
			else if(temp==parent.right)
				parent=temp.left;
	}
	


}
