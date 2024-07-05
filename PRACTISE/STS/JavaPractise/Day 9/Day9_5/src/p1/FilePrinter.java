package p1;

public class FilePrinter implements Printer{
	public void print(String msg)
	{
		System.out.println("FilePrinter - msg");
		System.out.println("Data"+ msg);
	}

}
