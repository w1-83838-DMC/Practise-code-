import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparator<Movie>
{
	private int year;
	private String name;
	double rating;
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Movie() {
		super();
		
	}
	
	public Movie(int year, String name, double rating) {
		super();
		this.year = year;
		this.name = name;
		this.rating = rating;
	}
	
	public String toString() {
		return "Movie [year=" + year + ", name=" + name + ", rating=" + rating + "]";
	}

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return 0;
	}


}
class Namingcompare implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
		
}
class Ratingcompare implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.rating<o2.rating) return -1;
		if(o1.rating>o2.rating) return 1;
		return 0;
	}
		
}
class yearcompare implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getYear()-o2.getYear();
	}
	
}

public class Day13_6 {
	public static void main(String[] args) {
		ArrayList<Movie> al= new ArrayList<Movie>();
		al.add(new Movie(2008,"Ramakant",2.3));
		al.add(new Movie(2001,"Ajay",9.0));
		al.add(new Movie(2007,"Susre",8.6));
		
		System.out.println("Before sort");
		for(Movie i: al)
		{
			System.out.println(i+"\t");
		}
		
		Namingcompare nobj= new Namingcompare();
		Collections.sort(al,nobj);
		
		System.out.println("After sort ");
		for(Movie i: al)
		{
			System.out.println(i +"\t");
		}
		
		System.out.println("Rating compare ");
		Ratingcompare robj= new Ratingcompare();
		System.out.println("After comparing Rating ");
		Collections.sort(al,robj);
		for(Movie i: al)
		{
			System.out.println(i + "\t");
		}
		
		System.out.println("Year compare");
		
		yearcompare yp= new yearcompare();
		Collections.sort(al,yp);
		System.out.println("After Sorting");
		for(Movie i: al)
		{
			System.out.println(i+ "\t");
		}
		
	}
	

}





