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
	private int count;
	public List()
	{
		head=null;
		count=0;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void add(Node before,Node after,Node newnode) {
		//1. add after into prev of newnode
		newnode.prev=after;
		//2. add before into next of newnode
		newnode.next=before;
		//3. Add newnode into prev of before 
		before.prev=newnode;
		//4. Add newnode into next of after 
		after.next=newnode;
	}
	public void fDisplay()
	{
		// if empty
		if(isEmpty())
			return;
		// forward traversal
		System.out.print(" Forward List : ");
		// create trav and start from head 
		Node trav=head;
		do 
		{
			// print current node 
			System.out.print(" "+ trav.data);
			// go to next node 
			trav=trav.next;
		}while(trav!=head);
		System.out.println(" ");
	}
	public void rDisplay()
	{
		// if empty 
		if(isEmpty())
			return;
		// reverse traversal
		System.out.print("Reversal list");
		// 1. create trav and start from last 
		Node trav=head.prev;
		do {
			
			// 2. Print current node 
			System.out.print(" "+ trav.data);
			// 3. go on next node 
			trav=trav.prev;
			
		}while(trav!=head.prev);
		System.out.println(" ");
	}
	
	public int length()
	{
		return count;
	}
	
	public void addfirst(int value)
	{
		// create Node 
		Node newnode= new Node(value);
		// if empty 
		if(head==null) {
			// add newnode into head
			head=newnode;
			// make list circular
			head.next=head.prev=newnode;
		}
		// if not empty 
		else {
			add(head,head.prev,newnode);
			// move head on newnode
			head=newnode;
		}
		count++;
	}
	
	public void addLast(int value)
	{
		// create Node 
		Node newnode= new Node(value);
		// if empty 
		if(isEmpty())
		{
			head=newnode;
			head.next=head.prev=newnode;
		}else  // if not empty 
		{
			add(head,head.prev,newnode);
			
		}
	}
	public void addposition(int value, int pos)
	{
		// create Node 
		Node newnode= new Node(value);
		// if empty 
		if(head==null)
		{
			// add newnode into head
			head=newnode;
			// make list circular
			head.prev=head.next=newnode;
		}else { // if not empty
			// traverse till pos-1 node 
			Node trav = head;
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			}
			add(trav.next,trav,newnode);
		}
		count++;
	}
	public void delete(Node before,Node after)
	{
		// add before into next of after
		after.next=before;
		// add after into prev of before
		before.prev=after;
	}
	public void deletefirst() {
		// if empty 
		if(head==null)
			return;
		// if single node 
		else if(head.next==head)
		{
			head=null;
		}// if multiple nodes
		else 
		{
			// move head on seconde node
			head=head.next;
			delete(head,head.prev.prev);
		}
		count--;
	}
	public void deleteLast()
	{
		// if empty 
		if(head==null)
			return;
		// if single node 
		else if (head.next==head)
		{
			head=null;
		}else // if multiple node 
		{
			// delete node 
			delete(head,head.prev.prev);
		}
		count--;
	}
	
	
}
