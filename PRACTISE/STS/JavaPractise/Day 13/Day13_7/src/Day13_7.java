// Create a file or create directory
import java.io.File;
import java.io.IOException;
/*
public class Day13_7 {
	public static void main(String[] args){
		String fname = "Demo.dat";
		File fobj= new File(fname);
		try {
		boolean b1=fobj.createNewFile();
		System.out.println("Boolean "+ b1);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
*/
/*
import java.io.File;
import java.io.IOException;
public class Day13_7
{
	public static void main(String[] args) throws IOException {
		String fname="Programs ";
		File fobj= new File(fname);
		boolean b2=fobj.mkdir();
		System.out.println("Status for making directory : "+ b2);
	}
}
*/
// deleting the file
/*
import java.io.IOException;
public class Day13_7
{
	public static void main(String[] args) {
		try {
		String fname="Demo.dat";
		File f1=new File(fname);
		boolean b1=f1.delete();
		System.out.println("Status " + b1);
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
}
*/
// Create file 
/*
import java.io.File;
class Day13_7
{
	public static void main(String[] args) throws IOException {
		String fname="file";
		File fobj= new File(fname);
		boolean b1=fobj.mkdir();
		System.out.println("Status "+ b1);
		System.out.println();
	}
}



// Delete file
/*
import java.io.File;
public class Day13_7
{
	public static void main(String[] args) {
		String fname="file";
		File fobj= new File(fname);
		boolean b2=fobj.delete();
		System.out.println("Status "+ b2);
	}
}
*/
/*
import java.io.File;
class Day13_7
{
	public static void main(String[] args) throws IOException {
		String pathname= "/home/ajay/Desktop/PRACTISE/STS/Day 13/Day13_7/file";
		File fobj= new File(pathname);
		System.out.println("Fobj : "+ fobj);
		System.out.println("Exists" + fobj.exists());
		System.out.println("Is File ? "+ fobj.isFile());
		System.out.println("Is Directory "+ fobj.isDirectory());
		System.out.println("Path "+ fobj.getPath());
		System.out.println("Absolute path "+ fobj.getAbsolutePath());
		System.out.println("Cannoical path "+ fobj.getCanonicalPath());
		System.out.println("Fobj = "+ fobj.length()); // given in kb
		System.out.println("get Parent file "+ fobj.getParent());
	}
}
*/

import java.io.File;
public class Day13_7
{
	public static void main(String[] args) {
		String fname="/home/ajay/Desktop/PRACTISE/STS/Day 13/Day13_7/";
		File fobj= new File(fname);
		System.out.println("is file ? "+ fobj.isFile());
		System.out.println("is directory "+ fobj.isDirectory());
		File arr[]=fobj.listFiles();	
		for( File i : arr)
		{
			System.out.println(i+ "\t");
		}
	}
}





