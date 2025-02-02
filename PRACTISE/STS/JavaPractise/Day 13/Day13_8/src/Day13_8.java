// read and write a single byte from binary file

// read  -> InputStream
// Write -> OutputStream

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day13_8
{
	static Scanner sc= new Scanner(System.in);
	static String pathname = "File.dat";
	
	static void ReadRecord() throws IOException
	{
		FileInputStream fis= null;
		
		fis= new FileInputStream(new File(pathname));
		byte value=(byte)fis.read();
		System.out.println("Values Read From the File"+ value);
		
		
		
		
	}
	static void WriteRecord() throws IOException  // Write Recored OutputSteam 
	{
		FileOutputStream fop=null;
		byte data =123;
		
		fop= new FileOutputStream(new File(pathname));
		fop.write(data);
		System.out.println("Data is written inside the file :");
		fop.close();
		
		
		
	}

	static int menulist()
	{
		System.out.println("0.Exit 1.Read 2.Write Please ENter your choice :  ");
		return sc.nextInt();
		
	}
	
	public static void main(String[] args) throws IOException
	{
		int choice;
		while((choice=menulist())!=0)
		{
		switch(choice)
		{
			case 1:
				ReadRecord();
				break;
			case 2:
				WriteRecord();
				break;
		}
		}
	}
	
}