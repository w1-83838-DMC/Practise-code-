import java.util.Scanner;
public class Day6_5 {
	public static void main(String[] args) {
		//int a1[][]= new int[4][2];  // 4 rows and 2 column
		//int s2[][]= new int[][]; // invalid javac error
		//int s3[][]= new int[4][]; // ok
		//int s4[][]= new int[][4]; // javac error
		//int a5[][]= {1,2,3,4,5,6,7,8,9};// javac error
//		int a5[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i=0; i<a5.length; i++)
//		{
//			for(int j=0; j<a5.length; j++)
//			{
//				System.out.print(a5[i][j]+ " ");
//			}
//			System.out.println();
//		}
		Scanner sc= new Scanner(System.in);
		int arr[][]= new int[4][3];
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
