package com.sunbeam;

public class List1 {
	static class Node{
		private char data;
		private Node next;
		public Node(char value)
		{
			data=value;
		}
	}
	private Node head;
	private Node tail;
	public List1()
	{
		head=null;
		tail=null;
	}
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	public void addFirst(char value)
	{
		// create node 
		Node newnode= new Node(value);
		// if list is empty 
		if(isEmpty())
		{
			// add newnode into head and tail 
			head=tail=newnode;
			// make list circular
			newnode.next=head;
		}else 
		{
			// add first node into newnode of next 
			newnode.next=head;
			// addnewnode into next of lastnode 
			tail.next=newnode;
			// move head on newnode
			head=newnode;
		}
	}
	public void display()
	{
		// if list is empty 
		if(head==null && tail==null)
			return;
		Node trav=head;
		do {
			System.out.print(" " +" " + trav.data);
			trav=trav.next;
		}while(trav!=head);
	}
	public void addLast(char value)
	{
		// create Node 
		Node newnode= new Node(value);
		if(isEmpty()) // if list is empty 
		{
			head=tail=newnode;
			newnode.next=newnode;	
		// if not empty 
		}else // if list is not empty  
		{
			// add first node into next of newnode 
			newnode.next=head;
			// add newnode into next of last node 
			tail.next=newnode;
			// move tail on newnode 
			tail=newnode;
		}
	}
	public void addposition(char value, int pos)
	{
		// create Node 
		Node newnode= new Node(value);
		// if list is empty 
		if(head==null && tail==null)
		{
			head=tail=newnode;
			// make list circular 
			newnode.next=head;
		}else // if list is not empty 
		{
			Node trav =head;
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			}
			// add pos node into next of newnode 
			newnode.next=trav.next;
			// add newnode into next of pos-1 
			trav.next=newnode;
		}
	}
	public void deleteFirst()
	{
		// if empty 	
		if(isEmpty())
			return ;
		// if single node
		else if (head==tail)
			head=tail=null;
		else {
			// add second node into next of last node
			tail.next=head.next;
			// move head on second node 
			head= head.next;
		}
	}
	public void deleteLast()
	{
		// if empty 
		if(isEmpty())
			return;
		// if single node 
		else if (head==tail)
			head=tail=null;
		// if multiple node 
		else 
		{
			// traverse till second last node 
			Node trav=head;
			while(trav.next.next!=head)
			{
				trav=trav.next;
			}
			// add first node into next of second last node 
			trav.next=head;
			// move tail on second last node 
			tail=trav;
		}
	}
	public void deletePosition(int pos)
	{
		if(isEmpty())
			return;
		else if (head==tail)
			head=tail=null;
		else {
			// 
			Node trav=head;
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			}
			trav.next=trav.next.next;
		}
	}
}
