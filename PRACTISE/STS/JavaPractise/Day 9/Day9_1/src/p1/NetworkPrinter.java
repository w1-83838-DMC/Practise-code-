package p1;

public class NetworkPrinter implements Printer {
	public void print(String msg)
	{
		System.out.println("Network Printer class");
		System.out.println("Message "+ msg);
		
	}
	void m1()
	{
		int n1= 10;
		int n2= 20;
		System.out.println("n1 + n2 = "+ (n1+n2));
	
	}
	static void f2() // its non overidden method f2() its own method static method 
	{
		System.out.println("inside static method ");
	}

}
