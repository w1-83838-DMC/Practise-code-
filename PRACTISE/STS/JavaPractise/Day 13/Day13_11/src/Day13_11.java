// Read and Write Multiple data bytes from Binary file

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Day13_11 {
	
	static Scanner sc= new Scanner(System.in);
	
	static String fname="File.dat";
	static void ReadData() throws IOException
	{	
		
		try(DataInputStream DI = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(fname))));)
		{
			int value=DI.readInt();
			float value1 = DI.readFloat();
			double valu2 = DI.readDouble();
			
			System.out.println(" Int : "+ value + " Float : "+ " Double : " + value1 + " Double " + valu2 );
		}
	}
	static void WriteData() throws IOException
	{
		try(DataOutputStream DI = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(fname))));)
		{
			DI.writeInt(23);
			DI.writeFloat(4.5f);
			DI.writeDouble(4.2);
			
		}
		
	}
	static int menuchoice()
	{
		System.out.println("0. Exit 1. Read 2. Write data on to the File ");
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
					WriteData();
					break;
				case 2:
					ReadData();
					break;	
			}
			
		}
		
	}

}
