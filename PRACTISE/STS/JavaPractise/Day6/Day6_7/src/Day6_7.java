
class Date
{
	int dd;
	int mm; 
	int yy;
	Date()
	{
		
	}
	Date(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	void displayDate()
	{
		System.out.println(this.dd + "/" + this.mm + "/" + this.yy);
	}
}
class Product{
	int pid;
	int price;
	String name;
	String companyname;
	String location;
	Date dobj;
	
	Product()
	{
		dobj= new Date();
		
	}
	
	Product(int pid, int price, String name, String companyname,String location, Date dobj)
	{
		this.pid=pid;
		this.price=price;
		this.name=name;
		this.companyname=companyname;
		this.location=location;
		this.dobj=dobj;
		
	}
	void display()
	{
		System.out.println(" Pid = "+this.pid + " Price = "+ this.price + " Name = " + this.price + " CompanyName = "+this.companyname + "Location = "+ this.location);
		dobj.displayDate();
	}

}
public class Day6_7
{
	public static void main(String[] args) {
		
		Product p1[]= new Product[2];
		
		p1[0]= new Product(12,14000,"Ajay","Sunbeam","Hinjawadi",new Date(24,3,2002));
		
		p1[1]= new Product(11,34000,"Raj","Sunbeam","Hinjwadi",new Date(23,9,2002));
		
		for(Product p: p1)
		{
			p.display();
			
		}
		
		
	}
}

/*
class Date
{
	int dd;
	int mm;
	int yy;
	
	Date()
	{
		
	}
	Date(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	void display()
	{
		System.out.println( this.dd +"/"+ this.mm +"/"+ this.yy);
	}
	
}
class student
{
	int rollno;  // filed
	int marks;   // filed
	Date dobj;   // Reference
	
	
	student()
	{
		dobj=new Date();
		
	}
	student(int rollno, int marks, Date dobj)
	{
		this.rollno=rollno;
		this.marks=marks;
		this.dobj=dobj;
	}
	void printData()
	{
		System.out.print(" Roll no = "+ this.rollno + " Marks ="+ this.marks + "\t");
		dobj.display();
		
	}
}
//public class Day6_7
//{
//	public static void main(String[] args) {
//		student s1= new student();
//		s1.printData();
//		
//	}
//}

public class Day6_7
{
	public static void main(String[] args) {
		student sarr[]= new student[3];
		sarr[0]=new student();
		sarr[1]=new student(11,876,new Date(24,3,2002));
		sarr[2]=new student(11,567,new Date(24,9,2002));
		
//		for(student s: sarr)
//		{
//			System.out.print(s+ "\t");
//		}
		for(student s: sarr)
		{
			s.printData();
		}
		
		
	}
	
}
*/

