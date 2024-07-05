package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class OverrattedException extends Exception 
{
	public OverrattedException() {
		System.out.println("Exception is Occured ! ");
	}
	
}
class indexOutofboundexception extends Exception
{
	public indexOutofboundexception()
	{
		System.out.println("Index Out-Off Bound ");
	}
	
}
public class Test 
{
	static Scanner sc= new Scanner(System.in);
	static ArrayList<Movie>al= new ArrayList<Movie>(); // In arrayList it is a class
	//Movie m1= new Movie();
	public static void main(String[] args) {
		int choice=0;
		do
		{
			System.out.println("1.Enter The Movie Data 2.Display The Movie Details 3. search Movie With name from collection 4.Remove Movie From the Collection 5. Display All the details 6. Rating check 7.Modify Movie details from collection 7. Remove Movie From Collection 8. Display all movie from Collection ");
			choice =sc.nextInt();
			switch(choice)
			{
				case 1:
					// for accepcting the  object m1 
					Movie m1= new Movie();
					m1.Accepct();
					al.add(m1);
					break;
					
				case 2:
					
					// display the content of ArrayList
					for(Movie m: al)
					{
						System.out.println(m);
					}
					break;
				case 3:
					
					// search the elements for particular position 
					System.out.println("Search Movie with Name from Collection  : ");
					String searchMoviename=sc.next();
					for(Movie m: al)
					{
						if(m.getMoviename().equals(searchMoviename))
						{
							System.out.println("Movie is present int The Directory The Movie Name is  : " + searchMoviename);
						}
						
					}
					break;
				case 4:
					System.out.println("Remove Movie From the Collection : ");
					try {
						for(Movie m: al)
						{
							int index=sc.nextInt();
							System.out.println("Enter The Index : ");
							if(index>=0)
							{
								al.remove(index);
							}else
							{
								throw new indexOutofboundexception();
							}
						}
					}catch(indexOutofboundexception e)
					{
						System.out.println("The index is not in Range : ");
					}
				case 5:
					System.out.println("Display The All Details : ");
					for(Movie m: al)
					{
						System.out.println(m);
					}
					break;		
				case 6:
					for(Movie m: al)
					{
						try {
						if(m.getRating()<=10)
						{
							System.out.println("Your rating is less than 10");
						}else
						{
							throw new OverrattedException();
							
						}
						}catch(OverrattedException e)
						{
							System.out.println("Exception is Occured !");
						}
					}
					break;
				case 7:
					
					for(Movie m:al)
					{
						System.out.println("Enter the Movie Name :");
						Scanner sc= new Scanner(System.in);
						String searchMoviename1=sc.next();
						m.setMoviename(searchMoviename1);
						break;
						
						//System.out.println("Modify Movie details from collection ");
						//Scanner sc= new Scanner(System.in);
						//String newMovieName=sc.nextLine();
						//Movie.setMoviename(newMovieName);					
					}
					break;
					
				case 8:
					for(Movie m: al)
					{
						System.out.println(m);
					}
					break;
			}		
		}while(choice!=0);
			
	}

}
