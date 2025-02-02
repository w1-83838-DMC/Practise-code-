// Sort the Movie Year  Based on your filed
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
class Movie implements Comparable<Movie>
{
	String name;
	double ratting;
	int year;
	
	public Movie() {
		super();
		
	}

	public Movie(String name, double ratting, int year) {
		super();
		this.name = name;
		this.ratting = ratting;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", ratting=" + ratting + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Movie o) {
		return this.year-o.year;
	}
	

}

public class Day13_5 {
	public static void main(String[] args) 
	{
		ArrayList<Movie> al= new ArrayList<Movie>();
		al.add(new Movie("ABC",3.4,2002));
		al.add(new Movie("XYZ",4.5,2001));
		al.add(new Movie("PQW",9.0,2000));
		
		System.out.println("Before Sorting : ");
		for(Movie m: al)
		{
			System.out.println(m);
		}
		Collections.sort(al);
		System.out.println("After Sorting : ");
		for(Movie m:al)
		{
			System.out.println(m);
		}
			
		
	}

}
