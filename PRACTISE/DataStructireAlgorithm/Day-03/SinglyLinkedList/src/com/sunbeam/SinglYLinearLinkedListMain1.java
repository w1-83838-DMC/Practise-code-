package com.sunbeam;

public class SinglYLinearLinkedListMain1 {
	public static void main(String[] args) {
		List1 l1= new List1();
		// add first
		l1.addfirst(10);
		l1.addfirst(20);
		l1.addfirst(30);
		l1.addfirst(40);
//		l1.display();
		// add last 
		l1.addLast(50);
		l1.display();
		//l1.deletefirst();
		l1.display();
		//l1.deleteLast();
		l1.display();
		//l1.deleteAll();
		//l1.display();
		l1.addposition(100, 1);
		l1.display();
		//l1.deleteposition(1);
		l1.deleteposition(10);
		l1.display();
		
	}

}
