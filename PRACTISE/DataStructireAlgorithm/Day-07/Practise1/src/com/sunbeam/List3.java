package com.sunbeam;

public class List3 {
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
	public List3()
	{
		head=null;
	}
	public boolean isEmpty(){
		return head==null;
	}
	
	public void add(Node before,Node after,Node newnode)
	{
		newnode.prev=after;
		newnode.next=before;
		before.prev=newnode;
		after.next=newnode;
	}
	public void addLast(int value)
	{
		Node newnode= new Node(value);
		
		if(head==null)
		{
			newnode=head;
			newnode.next=newnode.prev=head;
		}
		else
		{
			add(head,head.prev,newnode);
		}
	}
	public void addFirst(int value)
	{
		// create Node 
		Node newnode=new Node(value);
		// if empty
		if(head==null)
		{
			// addnewnode into head 
			head=newnode;
			newnode.next= newnode.prev=head;
		}else 
		{
			add(head,head.prev,newnode);
			head=newnode;
		}
	}

	public void display()
	{
		if(head==null)
			return;
		
		Node trav=head;
		do {
			System.out.print(" "+ trav.data);
			trav=trav.next;
		}while(trav!=head);
	}
	
	public void addposition(int value, int pos)
	{
		Node newnode = new Node(value);
		if(head==null)
		{
			head=newnode;
			newnode.next=newnode.prev=head;
		}else 
		{
			Node trav = head;
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			}
			add(trav.next,trav,newnode);
		}
	}
	public void deletefirst()
	{
		if(head==null)
		{
			return;
		}else
		{
			head=head.next;
			delete(head,head.prev.prev);
		}
	}
	public void delete(Node before,Node after)
	{
		after.next=before;
		before.prev=after;
		
	}
	


}
