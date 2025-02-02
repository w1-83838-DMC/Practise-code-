package com.sunbeam;

public class List {
	
	static class Node{
		private int data;
		private Node next;
		public Node(int value) // constructor 
		{
			data=value;
			next=null;
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
	public void addfirst(int value)
	{
		// 0. Create node for given data 
		Node newnode= new Node(value);
		// 1. add first node into next of newnode 
		newnode.next=head;
		// 2. move head on newnode 
		head=newnode;
	}
	
	public void display()
	{
		// create trav and start at first node 
		Node trav=head;
		System.out.print("List : : ");
		while(trav!=null)
		{
			//2 print/visit current node(trav.data)
			System.out.print(" "+ trav.data);
			//3. go to next node(trav.next)
			trav = trav.next;
		}// 4. repat step 2 and 3 till last node 
		System.out.print(" ");
	}
	
	public void addLast(int value)
	{
		// 1. create node for given data 
		Node newnode= new Node(value);
		// 2. if list is Empty 
		if(isEmpty())
		{
			head= newnode;
		}else  // 3. if List is not empty  
		{
			// traverse till last node
			Node trav=head;
			while(trav.next!=null)
			{
				trav=trav.next;
			}
				// add newnode into next of last node 
			trav.next=newnode;
		}	
	}
	public void DeleteFirst()
	{
		// 1. if list is empty 
		if(isEmpty())
			return;
		// 2. if list is not empty 
		else 
			// a. move head on second node
			head= head.next;
	}
	
	public void DeleteLast()
	{
		// 1. If List is Empty
		if(isEmpty())
			return;
		// 2, If list has single node then head== null
		else if(head.next==null)
		{
			head=null;
		}else  // if List has Multiple node 
		{
			// traverse till second last node 
			Node trav=head;
			while(trav.next.next!=null);
				
		}
	}
	
	public void deleteAll()
	{
		head=null;
	}
	public void Addposition(int value,int pos)
	{
		// 1. Create newnode for given data 
		Node newnode= new Node(value);
		// 2.If list is empty 
		if(isEmpty())
			head=newnode;
		else if(pos<=1)
			addfirst(value);	// special case 1
		else 
		{
			// traverse till pos-1 Node
			Node trav=head;
			for(int i=1; i<pos-1 && trav.next!=null; i++) // case 2: when we entered invalid index it will go upto end 
				trav= trav.next;
			// add pos into  next of new node 
			newnode.next=trav.next;
			// add newnode into next of pos-1 node 
			trav.next=newnode;
		
		}
	}
	public void deleteposition (int pos)
	{
		// 1. if list is empty 
		if(isEmpty())
			return;
		// 2. if list has single node 
		else if(head.next==null)
		{
			head=null;
			
		// special case 1: 
		}else if (pos<=1) {
			DeleteFirst();
		}else {
			Node trav=head;   // special case 2:  we need to check the trav condition 
			for(int i=1; i<pos-1 && trav.next.next!=null; i++)
			{
				trav=trav.next;
			}
			trav.next=trav.next.next;
		}
	}
}
