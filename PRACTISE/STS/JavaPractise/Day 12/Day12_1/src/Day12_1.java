import java.util.ArrayList;

public class Day12_1 {
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		
		System.out.println(" A1 "+ a1);
		
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.addAll(a1);
		System.out.println(" A2 "+ a2);
		
		ArrayList<Integer>a3=a2;  // Reference copy
		System.out.println(" A3 "+ a3);
		
		System.out.println("A1 size is "+ a1.size());
		System.out.println("A2 size is "+ a2.size());
		System.out.println("A3 size is "+ a3.size());
		
		a1.add(2,100);
		System.out.println("A1 modified is :"+ a1);
		System.out.println("A1 size is "+ a1.size());
		a3=a1;
		System.out.println("A2 "+ a2);
		System.out.println("A3 "+ a3);
		
		a2.add(4,89);
		System.out.println("A2 modifies is : "+ a2 + "size is "+ a2.size());
		a3=a2;
		System.out.println("A3 modifies is : "+ a3 + "size is "+ a3.size());
		
		
		
	}

}
