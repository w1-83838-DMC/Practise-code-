package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data=value;
			next=prev=null;
		}
	}
	private Node head;
	private Node tail;
	public List()
	{
		head=tail=null;
	}
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	
	public void fDisplay()
	{
		// Forward traversal 
		System.out.println("Forward List : ");
		// 1. create trav and start from head
		Node trav = head;
		while(trav!=null) {
			// print current node 
			System.out.print(" "+ trav.data);
			// go on next node 
			trav=trav.next;
		}
		System.out.println("");	
	}
	public void rDisplay() {
		//reverse traversal
		System.out.print("Reverse List : ");
		//1. create trav and start from tail
		Node trav = tail;
		while(trav != null) {	
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on prev node
			trav = trav.prev;
		}//4. repeat 2 and 3 till first node
		System.out.println("");
	}
	
	
	public void deleteAll()
	{
		head=tail=null;
	}
	
	public void addfirst(int value)
	{
		// create Node 
		Node newnode= new Node(value);
		// if empty 
		if(isEmpty())
		{
			// if empty add newnode into head and tail 
			head=tail=newnode;
		}else // if lisy is not empty 
		{
			// add firstnode into next of newnode 
			newnode.next=head;
			// add newnode into prev of first node 
			head.prev=newnode;
			// c. move head on on newnode 
			head=newnode;
		}	
	}
	public void addLast(int value)
	{
		// create nod 
		Node newnode= new Node(value);
		// if empty 
		if(isEmpty())
			// add newnode into head and tail 
			head=tail=newnode;
		else  //if not empty 
		{
			// a. add last node into prev of newnode
			newnode.prev=tail;
			// add newnode into next of last node 
			tail.next=newnode;
			// move tail on newnode 
			tail=newnode;
			
		}
	}
	
	public void deletefirst()
	{
		// if empty
		if(head==null && tail==null)
			return;
		// if single node 
		else if(head==tail)
			head=tail=null;
		else // if multiple nodes
			// move head on second node 
		{
			head=head.next;
			head.prev=null;
		}	
	}
	public void deleteLast()
	{
		// if empty 
		if(isEmpty())
			return;
		else if(head==tail) // if list has single node 
			head=tail=null;
		else 
		{
			// move tail on second last node 
			tail=tail.prev;
			// make next of second last node null
			tail.next=null;
			
		}
				
	}
	
	
}
