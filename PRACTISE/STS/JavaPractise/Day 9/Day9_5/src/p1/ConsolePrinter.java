package p1;

public class ConsolePrinter implements Printer{
	public void print(String msg)
	{
		System.out.println("ConsolePrinter - msg");
		System.out.println("msg"+msg);
		
	}
}
