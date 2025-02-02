package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		public Node(int value)
		{
			data=value;
		}
	}
	private Node head;
	public List()
	{
		head=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public void addFirst(int value)
	{
		// create Node 
		Node newnode= new Node(value);
		//add first node into newnode 
		newnode.next=head;
		// move head on newnode 
		head=newnode;
	}
	public void display()
	{
		// create trav and start at first node 
		Node trav=head;
		while(trav!=null)
		{
			// print/ visit current node (trav.data)
			System.out.print(" "+ trav.data);
			// go on next node 
			trav=trav.next;
		}
		System.out.println(" ");
	}
	public void addLast(int value)
	{
		// create Node for given data 
		Node newnode= new Node(value);
		// if list is empty 
		if(isEmpty())
		{
			head=newnode;
		}// if list is not empty 
		else 
		{
			// travse till last node 
			Node trav=head;
			while(trav.next!=null)
			{
				trav=trav.next;
			// add newnode into next of lastNode 
			}
			trav.next=newnode;
		}
	}
	public void deleteFirst()
	{
		// if list is empty 
		if(isEmpty())
		{
			return;
		}else
		{
			// move head on second node 
			head= head.next;
		}
	}
	public void deleteLast()
	{
		// if is Empty
		if(head==null)
		{
			return;
		}else if(head.next==null)
		{
			head=null;
		}else 
		{
			// traverse till second last node 
			Node trav=head;
			while(trav.next.next!=null)
			{
				trav=trav.next;
			}
			trav.next=null;
		}
	}
	// add position 
	public void addposition(int value,int pos)
	{
		// create newnode for given data 
		Node newnode= new Node(value);
		// if list is empty 
		if(isEmpty())
		{
			return ;
		}else {
			//traverse till pos-1 node 
			Node trav=head;
			
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			}
			// add pos node into next of newnode 
			newnode.next=trav.next;
			trav.next=newnode;	
		}
	}
	public void deleteposition(int pos)
	{
		// if list is empty 
		if(head==null)
		{
			return;
		}else if (head.next==null)// if list has single node
		{
			head=null;
		}else  // if list has multiple node
		{
			Node trav=head;
			// traverse till pos-1
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			}
			trav.next=trav.next.next;
		}		
	}
	
	public void deletAll()
	{
		head=null;
	}

}
