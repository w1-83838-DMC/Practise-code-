package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		
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
	public void add(Node before,Node after,Node newnode)
	{
		newnode.next=before;
		newnode.prev=after;
		before.prev=newnode;
		after.next=newnode;
	
	}
	public void addNode(int value)
	{
		Node newnode= new Node(value);
		if(head==null)
		{
			head=newnode;
			// make list circular
			newnode.next=newnode.prev=head;
		}else
		{
			// if not empty 
			add(head,head.prev,newnode);
			head=newnode;
		}
	}
	public void display()
	{
		Node trav=head;
		do {
			trav=trav.next;
			System.out.print(" "+ trav.data);
		}while(trav!=head);
	}
}
