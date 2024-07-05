package p1;

public class Day9_1 {
	public static void main(String[] args) {
		
	//Printer p1= new Printer(); We cant create the object the Interface
	
//	Printer p1= new FilePrinter(); // upcasting
//	//p1.print("10 pages ");
//	
//	System.out.println("---------------");
//	p1= new NetworkPrinter();
//	p1.print("NetworkPrinter");
//	
//		
//	System.out.println("---------------");
//	p1=new ConsolePrinter();
//	p1.print("ConsolePrinter");

		Printer pr[]= {new FilePrinter(), new NetworkPrinter()};
		pr[0]= new FilePrinter();
		pr[1]= new NetworkPrinter();
		
		for(Printer p : pr)
		{
			System.out.println(p); // it will call toString method 
			p.print("Core - java");
		}
		
		
	}

}
