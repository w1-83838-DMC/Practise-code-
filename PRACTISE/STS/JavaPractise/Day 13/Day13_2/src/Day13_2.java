
// user define data type hashset
import java.util.HashSet;
import java.util.Objects;
class student
{
	String name;
	student()
	{
		
	}
	student(String name)
	{
		this.name=name;
		
	}
	public String toString()
	{
		return "Name: "+this.name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
public class Day13_2 {
	public static void main(String[] args) {
		HashSet<student>h1= new HashSet<student>();
		student s1= new student("abc");
		student s2= new student("xyz");
		student s3= new student("pqr");
		h1.add(s1);
		h1.add(s2);
		h1.add(s3);
		System.out.println("Hashset "+ h1);
		
		
	}

}
