package com.sunbeam;

public class List2 {
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
	public List2()
	{
		head=tail=null;
	}
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	public void addfirst(int value)
	{
		// create Node 
		Node newnode= new Node(value);
		// if empty 
		if(head==null && tail==null)
		{
			head=tail=newnode;
		}else // if list is not empty 
		{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	public void addLast(int value)
	{
		//create Node 
		Node newnode= new Node(value);
		// if  list empty
		if(head==null && tail==null)
		{
			head=tail=newnode;
		}else  // if list is not empty  
		{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
	}
	public void deletefirst()
	{
		// if empty
		if(head==null && tail==null)
			return;
		else if(head==tail)// if single node  head contain 100 and tail contain 100
			head=tail=null;
		else {
			head=head.next;
			head.prev=null;
		}
			
	}
	public void deleteLast()
	{
		if(head==null && tail==null)
		{
			return;
		}else if(head==tail) // if only one list
		{
			head=tail=null;
		}else // if multiple list 
		{
			// move tail on secnd last node 
			tail=tail.prev;
			// make next of second last node null
			tail.next=null;
		}
	}
	public void Fdisplay()
	{
		System.out.println(" Forward List :  ");
		
		// forward traversal 
		Node trav=head;
		while(trav!=null)
		{
			// print current node 
			System.out.print(" "+ trav.data);
			trav=trav.next;
		}
		System.out.println("");
		
	}
	public void Rdisplay()
	{
		System.out.println("Reverse List : ");
		Node trav=tail;
		while(trav!=null)
		{
			System.out.print(" "+ trav.data);
			trav=trav.prev;
		}
		System.out.println("");
		
	}
}
