// Read and Write Multiple bytes from Binary file
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day13_10 {
	
	static Scanner sc= new Scanner(System.in);
	static String fname= "File,dat";
	
	public static void ReadData() throws IOException
	{
		try(BufferedInputStream bis= new BufferedInputStream(new FileInputStream(new File(fname)));)
		{
			for(char ch='A'; ch<='Z'; ch++)
			{
				System.out.print((char)bis.read()+"\t");
			}
		}
	}

	public static void WriteData() throws IOException
	{
		try(BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream(new File(fname)));)
		{
			for(char ch='A';ch<='Z'; ch++)
			{
				bos.write(ch);	
			}
		}
	}
	static int menuList()
	{
		System.out.println("0. Exit 1. Read 2. Add the data in the file : ");
		return sc.nextInt();
	}
	public static void main(String[] args) throws IOException 
	{
	
		int choice;
		while((choice=menuList())!=0)
		{
			switch(choice)
			{
				case 1:
					WriteData();
					break;
				case 2:
					ReadData();
					break;
				
			}
		
		
	}

	}
}

