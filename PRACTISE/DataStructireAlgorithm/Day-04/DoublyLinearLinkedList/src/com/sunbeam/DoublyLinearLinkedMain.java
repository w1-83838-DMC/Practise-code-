package com.sunbeam;

public class DoublyLinearLinkedMain {

	public static void main(String[] args) {
		List l1= new List();
		l1.addfirst(30);
		l1.addfirst(40);
		l1.addfirst(50);
		
		l1.addLast(80);
		l1.addLast(90);
		
		l1.fDisplay();
		l1.rDisplay();
		l1.deletefirst();
		l1.fDisplay();
		l1.rDisplay();
		l1.deleteLast();
		l1.fDisplay();
		l1.rDisplay();
	
	}

}
