package a1;

import java.util.Scanner;

public class Movie {

	private String moviename;
	private String Type;
	private int releasedate;
	private String Theaterlocation;
	private int rating;
	private String productionhouse;
	public Movie() {
		super();
		
	}
	public Movie(String moviename, String type, int releasedate, String theaterlocation, int rating,
			String productionhouse) {
		super();
		this.moviename = moviename;
		this.Type = type;
		this.releasedate = releasedate;
		this.Theaterlocation = theaterlocation;
		this.rating = rating;
		this.productionhouse = productionhouse;
	}
	public void Accepct()
	{
		System.out.println("Enter the Movie Name : ");
		Scanner sc= new Scanner(System.in);
		this.moviename=sc.next();
		System.out.println("Enter the Type ");
		this.Type=sc.next();
		System.out.println("Enter The Realease Date : ");
		this.releasedate=sc.nextInt();
		System.out.println("Enter The TheaterLocation : ");
		this.Theaterlocation=sc.next();
		System.out.println("Enter the Rating : ");
		this.rating=sc.nextInt();
		System.out.println("Enter the Production House :");
		this.productionhouse=sc.next();
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(int releasedate) {
		this.releasedate = releasedate;
	}
	public String getTheaterlocation() {
		return Theaterlocation;
	}
	public void setTheaterlocation(String theaterlocation) {
		Theaterlocation = theaterlocation;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getProductionhouse() {
		return productionhouse;
	}
	public void setProductionhouse(String productionhouse) {
		this.productionhouse = productionhouse;
	}
	@Override
	public String toString() {
		return "Movie [moviename=" + moviename + ", Type=" + Type + ", releasedate=" + releasedate
				+ ", Theaterlocation=" + Theaterlocation + ", rating=" + rating + ", productionhouse=" + productionhouse
				+ "]";
	}
	
	
}
