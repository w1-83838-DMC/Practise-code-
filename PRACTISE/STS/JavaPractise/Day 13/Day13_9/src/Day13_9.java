// 
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Day13_9 {
	
	static Scanner sc= new Scanner(System.in);
	
	static String filename= "File.dat";
	
	static void ReadRecord() throws IOException
	{
		try(FileInputStream FIS = new FileInputStream(new File(filename));)
		{
			byte value=(byte)FIS.read();
			System.out.println("Value Read From the FIle "+ value );
			
		}
		
	}
	static void WriteRecord() throws IOException
	{
		//FileOutputStream fop=null;
		//fop= new FileOutputStream(new File(filename));
		try(FileOutputStream fop = new FileOutputStream(new File(filename));)
		{
			int data= 123;
			fop.write(data);
			System.out.println("Data is Written inside the file ");
		}
		
		
	}
	
	static int menulist()
	{
		System.out.println("0. Exit 1. Read 2. Write Please Enter your Data ");
		return sc.nextInt();
		
	}
	public static void main(String[] args) throws IOException{
		
		int choice;
		while((choice=menulist())!=0)
		{
		switch(choice)
		{
			case 1: ReadRecord();
				break;
			case 2: WriteRecord();
				break;
			}
		}
	}

}
