// Read and write Multiple Bytes from binary file 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.WriteAbortedException;
import java.util.Scanner;

public class Day14 {
	
	static Scanner sc= new Scanner(System.in);
	static String filename="Demo.text";
	
	static void ReadData() throws FileNotFoundException , IOException
	{
		try(BufferedReader boi = new BufferedReader(new FileReader(new File(filename)));)
		{
			for(int i='A'; i<='Z'; i++)
			{
				System.out.println((char)boi.read());
			
			}
		}
		
		
		
	}
	static void WriteData() throws FileNotFoundException, IOException
	{
		try(BufferedWriter bo= new BufferedWriter(new FileWriter(new File(filename)));)
		{
			for(int i='A'; i<='Z'; i++)
			{
				bo.write(i);
			}
		
		}
	}
	
	static int menuchoice()
	{
		System.out.println("0. Exit 1.Read 2.Write the data on FIle : ");
		return sc.nextInt();
				
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int choice;
		while((choice=menuchoice())!=0)
		{
			switch(choice)
			{
				case 1:
					ReadData();
					break;
				case 2:
					WriteData();
					break;
			}
				
		}
		
	}
	

}
