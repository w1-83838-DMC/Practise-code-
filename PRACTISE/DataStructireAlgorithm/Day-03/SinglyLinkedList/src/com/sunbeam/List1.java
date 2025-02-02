package com.sunbeam;

public class List1 {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value )
		{
			data=value;
			next=null;
		}
	}
	private Node head; 
	public List1() {   // first head is pointing to the null
		head=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addfirst(int value)
	{
		// create node for give data
		Node newnode= new Node(value);
		// add first node into next of newnode
		newnode.next=head;
		// move head on newnode 
		head=newnode;
	}
	public void display()
	{
		//1 create trav and start at first Node 
		Node trav=head;
		System.out.print("List ::  ");
		while(trav!=null)
		{
			//2. print and visit current node(trav.data)
			System.out.print(" "+trav.data);
			//3. go to the next node (trav.next)
			trav=trav.next;
		}// 4. repeat step 2 and 3 till last node
		System.out.println(" ");
	}
	public void addLast(int value)
	{
		// Create Node for Given Data 
		Node newnode= new Node(value);
		// if list is empty add newnode into head 
		if(head==null)
		{
			head=newnode;
		}else { // if list is not empty 
			// traverse till last node 
			Node trav=head;
			while(trav.next!=null)
			{
				trav=trav.next;
			// add newnode into next of of LastNode 
			}	
			trav.next=newnode;
			
		}
	}
	public void deletefirst()
	{
		// if list is empty 
		if(head==null)
			return;
		// if list is not empty 
		else {
			//move head on second node 
			head=head.next;
		}	
	}
	
	public void deleteLast()
	{
		// if list is empty 
		if(head==null)
			return;
		// if list has single node 
		else if(head.next==null)
		{
			head=null;
		}else 
		{
			// if list has multiple node 
			// Traverse Till last node condition while(trav.next.next!=null) 
			Node trav=head;
			while(trav.next.next!=null)
			{
				trav=trav.next;
			// add null into next of second last node
			}
			trav.next=null;
		}
	}
	public void deleteAll()
	{
		head=null;
	}
	public void addposition(int value,int pos)
	{
		// 1.create Newnode for given data 
		Node newnode= new Node(value);
		// 2. if list is Empty 
		if(head==null)
			head=newnode;
		else if (pos<=1)
		{
			addfirst(value);
		}
		else 
		{
			// if list is not empty 
			Node trav= head;
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			}
			// make before break strategy
			newnode.next=trav.next;
			trav.next=newnode;
		}
	}
	public void deleteposition(int pos)
	{
		// if list is empty 
		if(head==null)
			return;
		// if list has single node 
		// special case : 1
		else if (pos<=1)
		{
			deletefirst();
		}
		else if (head.next==null)
		{
			head=null;
		}else // if list has multiple node 
		{
			// traverse till pos-1 node 
			Node trav=head;
			
			for(int i=1; i<pos-1 && trav.next.next!=null; i++)
			{
				trav=trav.next;
			}
			trav.next=trav.next.next;	
		}
		
	}

}
