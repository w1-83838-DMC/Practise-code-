package com.sunbeam;

public class DoublyCircularLinkedListMain {
	public static void main(String[] args) {
		List l1= new List();
		l1.addfirst(40);
		l1.addfirst(50);
		l1.addposition(12, 2);
		l1.addLast(100);
		l1.addfirst(40);
		l1.fDisplay();
		l1.rDisplay();
		System.out.println(" ------------------- ");
		l1.deletefirst();
		l1.fDisplay();
		l1.rDisplay();
		System.out.println("-------------------------");
		l1.deleteLast();
		l1.fDisplay();
		l1.rDisplay();
	}

}
