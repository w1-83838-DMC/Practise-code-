package p1;

public class Day10_1 {
	public static void main(String[] args) {
//		Student sobj= new Student("Ajay",19,12345,"Dmc");
//		Trainer tobj= new Trainer("Jay",34,456,"DAC");
//		
//		sobj.test();
//		sobj.displayMarks(12);
//		System.out.println(sobj);
//		
//		tobj.test();
//		tobj.displayDetails("1200");
//		
//		System.out.println("Name = "+ tobj.getName());
//		System.out.println("Age = "+ tobj.getage());
//		System.out.println("TID =" + tobj.getTid());
//		System.out.println("Department = "+ tobj.getdepartment());
		
		
//		Student sobj= new Student("st1", 19 , 83838 , "DAC");
//		Trainer tobj= new Trainer("st2", 12 , 83839 , "DMC");
		
		// upcasting 
//		Person pobj=sobj; // upcasting   // object of sub class student  pobj is a super type person 
//		System.out.println(" Name: " + pobj.getName());
//		System.out.println(" Age: " + pobj.getage());
//		System.out.println(" Roll no : " + sobj.getRollno());
//		System.out.println(" Course Name : "+ sobj.getcoursename());
//		
//		pobj=tobj;  // upcasting 
//		System.out.println(" Name: "+ pobj.getName());
//		System.out.println(" Age: " + pobj.getage());
		
		
//		Person pobj = new Student("st1",19, 83838,"DMC"); // upcasting
//		System.out.println("Name: " + pobj.getName());
//		System.out.println("Age : "+ pobj.getage());
		
//	
//		Person pobj= new Student("st1",19,83838,"DMC");
//		Student sobj = (Student)pobj;  // Downcasting
//		System.out.println("Name : "+ sobj.getName());
//		System.out.println("Age :  "+ sobj.getage());
//		System.out.println("Rollno: "+sobj.getRollno());
//		System.out.println("CourseName : "+ sobj.getcoursename());
//		
//		Person pobj1 = new Trainer("st2",45,84383,"DAC"); 
//		Trainer tobj= (Trainer)pobj1;
//		System.out.println("Name : "+ tobj.getName());
//		System.out.println("Age : "+ tobj.getage());
//		System.out.println("tid : "+ tobj.getTid());
//		System.out.println("Department "+ tobj.getdepartment());
		
		
		Person pobj= new Student("st3",34,87542,"DMX");  // upcasting
		
		Trainer tobj= (Trainer)pobj;  // java.lang.ClassCastException 
		
		// Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance  
		
	}

}
