package com.sunbeam;

public class List {
	static class Node{
		private char data;
		private Node next;
		private Node(char value) // default constructor 
		{
			data=value;
			next=null;
		}
	}
	private Node head;
	private Node tail;
	private int count;
	public List()
	{
		head=tail=null; // initially null
		count=0;
	}
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	
	public void addFirst(char value)
	{
		//0. create Node 
		Node newnode= new Node(value);
		// 1. if empty 
		if(head==null)
		{
			// add newnode into head and tail 
			head=tail=newnode;
			// make list circular
			newnode.next=head;
		}else { // if not empty 
			// add first node into next of newnode
			newnode.next=head;
			// add newnode into next of last node 
			tail.next=newnode;
			// move head on newnode 
			head=newnode;
		}
		// increment count 
		count++;
	}
	
	public void addLast(char value)
	{
		//1. Create Node 
		Node newnode= new Node(value);
		//2. if empty 
		if(isEmpty())
		{
			// add newnode into head and tail 
			head= tail=newnode;
			// make list circular 
			newnode.next=head;
		}
		//3.if not empty 
		else {
			// add first node(head) into next of newnode 
			newnode.next=head;
			// addnewnode into next of last node 
			tail.next=newnode;
			// move tail on newnode 
			tail=newnode;
		}
		// 4. increment count 
		count++;
		
	}
	
	public void addposition(char value,int pos)
	{
		// -1 validate position 
		// valid position : 1 >= pos <=count+1
		// invalid position : 1 < pos > count+1 
		if(pos<1 || pos> count+1)
		{
			System.out.println("Invalid position ");
			return ;
		}
		//1 create node 
		Node newnode= new Node(value);
		//2.  if empty 
		if(isEmpty())
		{
			// a. addnewnode into head and tail 
			head=tail=newnode;
			// b. Make list circular 
			tail.next=head;	
		}else if(pos==1)
		{
			addFirst(value);
			return;
		}else if(pos==count+1)
		{
			addLast(value);
			return;
		}
		else  // 3. if not empty 
		{
			// a. traverse till pos-1 node 
			Node trav=head;
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			}
			// add pos node into next newnode 
			newnode.next=trav.next;
			// add newnode into next of pos-1 node 
			trav.next=newnode;
		}
		count++;
		
	}
	public void display()
	{
		// 0. if list is empty 
		if(head==null)
			return;
		// create trav and start at first node
		Node trav=head;
		// visit/ print current node 
		do {
			System.out.print(" "+trav.data);
			// go to the next node 
			trav=trav.next;
		}while(trav!=head);
		System.out.println("\n Node count : "+ count);
		System.out.println("\n last node : "+tail.data);
	}
	public void deletefirst()
	{
		//1. if Empty
		if(isEmpty())
		{
			return ;
		}// 2. if Single node 
		else if (head==tail)
		{
			head=tail=null;
		}// 3. if multiple nodes 
		else {
			// add second node into next of last node 
			tail.next=head.next;
			// move head on second node 
			head=head.next;	
		}
		count--;
	}
	public void deletelast()
	{
		//1. If List is empty 
		if(isEmpty())
			return ;
		//2. if single node 
		else if (head==tail)
		{
			head=tail=null;
		}
		// 3. if multiple nodes
		else 
		{
			// traverse till last second node 
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
		// 4. decrement count 
		count--;
	}
	
	public void deletePosition(int pos)
	{
		// -1 validate position
		// validate position : 1 >=pos<=count 
		// invalidate position : 1<pos>count 
		if(isEmpty())
			return;
		// if single node 
		else if(head==tail)
			head=tail=null;
		// if multiple nodes
		else 
		{
			// traverse till pos-1 node 
			Node trav=head;
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			// 	
			}
			//trav.next=tail;
			trav.next=trav.next.next;
		}
		count--;
	}

}
