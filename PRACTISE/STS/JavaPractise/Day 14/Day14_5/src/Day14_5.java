// Read and write multiple bytes from binary file 
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Day14_5 {
	
	static Scanner sc= new Scanner(System.in);
	static String file = "Demo.txt";
	
	
	public static void Adddatamultiplebyte() throws IOException
	{
		try(BufferedWriter bwr= new BufferedWriter(new FileWriter(new File(file)));)
		{ // Write multiple data 
			for(int i='A'; i<='Z'; i++)
			{
				bwr.write(i);
			}
			
		}
	}
	public static void Readdatamultiplebyte() throws IOException
	{
		try(BufferedReader br = new BufferedReader(new FileReader(new File(file)));)
		{
			for(int i='A'; i<='Z'; i++)
			{
				int value=br.read();
				System.out.println("Value "+ value + "\t");
			}
		}
		
	}
	static int menuchoice()
	{
		System.out.println("0.Exit 1.Add data 2. Read data : ");
		return sc.nextInt();	
	}
	
	public static void main(String[] args) throws IOException 
	{
		int choice;
		while((choice=menuchoice())!=0)
		{
			switch(choice)
			{
				case 1:
					Adddatamultiplebyte();
					break;
				case 2:
					Readdatamultiplebyte();
					
			}
		
		}
		
	}

}
