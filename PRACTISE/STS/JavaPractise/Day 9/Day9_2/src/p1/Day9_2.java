package p1;

public class Day9_2 {
	public static void main(String[] args) {
//		Machine mobj= new Machine();
//		mobj.start();
//		
//		System.out.println("-----------------");
//		
//		Laptop lobj= new Laptop();
//		lobj.start();
//		lobj.stop();
//		
//		System.out.println("------------------");
//		
//		Desktop dobj= new Desktop();
//		dobj.start();
//		dobj.stop();
		
		
		// Upcasting 
		// Machine mobj = lobj;
		// mobj(super) is holding object of lobj(sub class)
		// when we call mobj.start() ==> is called from laptop class 
		
		// mobj=dobj;
		// mobj points to desktop class object 
		// when mobj.start() ==> will be called from Desktop class 
		// it is also called as Run time polymorphism  and DYNAMIC METHOD DISMATCH
	
		
		// upcasting : Assign a child class objet to parrent class reference 
		
//		Laptop lobj= new Laptop();
//			Machine machineobj=lobj; // upcasting 
//			machineobj.start();  // laptop - start
//			machineobj.stop();  // laptop - stop 
//			
//			System.out.println("-------------------");
//			
//		Desktop dobj= new Desktop();
//			machineobj=dobj;
//			machineobj.start(); // Desktop - start 
//			machineobj.stop();
		
		
		// Downcasting : Assign parent class reference it should point to child class object to child class 
		
//		Laptop lobj= new Laptop();
//		Machine machobj=lobj;
//		lobj=(Laptop)machobj;
//		lobj.start();
//		lobj.stop();
		
		// Downcating Assign parrent class reference it should point to child class object to child class
		
		Machine machineobj= new Laptop(); // upcasting;
//		machineobj.start();
		
		// downcating
		
		Laptop l1=(Laptop)machineobj;
		l1.start();
		l1.stop();
		
		System.out.println("------- -------------");
		
		machineobj=new Desktop();
		//Downcasting
		Desktop d1=(Desktop)machineobj; 
		d1.start();
		d1.stop();
		
		
	
		
		
		
		
		
	}

}
