package com.sunbeam;

public class SinglyLinearLinkedList {

	public static void main(String[] args) {
		
		List l1= new List();
		l1.addfirst(40);
		l1.addfirst(30);
		l1.addfirst(50);
		
		
		l1.addLast(100);
		l1.addLast(400);
		l1.DeleteFirst();
		
		
		l1.Addposition(24, 1);
		//l1.deleteAll();
		l1.deleteposition(10); //10 index is not exist the it first check trav = trav.next.next!=null
		
		
		
		l1.display();
		
	
		

	}

}
