// Read and write a single byte from text file

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day14_4 {
	
	static Scanner sc=new Scanner(System.in);
	static String file= "Demo.txt";
	
	public static void Adddata() throws IOException
	{
		try(FileWriter fw= new FileWriter(file))
		{
			int data=123;
			fw.write(data);
			System.out.println("The data is written on the file : ");
		}
	}
	public static void Readdata() throws FileNotFoundException, IOException
	{
		try(FileReader fr= new FileReader(file))
		{
			int value=fr.read();
			System.out.println("Value "+ value);
		}
		
	}
	
	static int menuchoice()
	{
		System.out.println("0.Exit 1. AddData 2.ReadData ");
		return sc.nextInt();
	}
	public static void main(String[] args) throws IOException {
		int choice;
		while((choice=menuchoice())!=0)
		{
			switch(choice)
			{
				case 1:
					Adddata();
					break;
				case 2:
					Readdata();
					break;
					
			}
		}
		
	}

}
