package com.sunbeam;

public class SinglyCircularLinkedListMain {
	public static void main(String[] args) {
	
		List l1= new List();
		l1.addFirst('N');
		l1.addFirst('U');
		l1.addFirst('S');
		l1.addLast('B');
		l1.addLast('E');
		l1.addLast('A');
		l1.addLast('M');
		
		
		//l1.addposition('@', 4);
		//l1.display();
		//l1.addposition('@',8);
		//l1.deletefirst();
		//l1.display();
		//l1.deletelast();
		l1.deletePosition(4);
		l1.display();
	}
}
