package p1;

public class FilePrinter implements Printer {
	
	public void print(String msg)
	{
		System.out.println("FilePrinter class ");
		System.out.println("Message "+ msg);
	}

}