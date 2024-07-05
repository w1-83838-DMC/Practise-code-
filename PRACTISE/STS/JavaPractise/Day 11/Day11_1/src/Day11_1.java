// parseInt() Throws NumberformatException 
// NumberFormatException belongs to RunTimeexception so it is (Unchecked Exception)
// it is compulsory to handle this exception at the time of application Development 


//public class Day11_1
//{
//	public static void main(String[] args) {
//		
//		String str= "12345abcdwf";  // numberformatexception 
//		int num= Integer.parseInt(str);
//		System.out.println("Num"+ num);
//		System.out.println("Str "+ str);
//		
//	}
//	
//}


public class Day11_1
{
	public static void main(String[] args) {
		try {
			String str="1234abvs";   // string to int conversion 
			int n1=Integer.parseInt(str);
			System.out.println("n1: "+ n1);
			System.out.println("str: "+ str);
			
		}catch(NumberFormatException e)
		{
			System.out.println("You are not given the peoper the valid input give it proper input ! ");
		}
		
	}
}