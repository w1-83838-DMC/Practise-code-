// .class file
// getClass()
// forName()
class Demo
{
	
}
//public class Test {
//	public static void main(String[] args) {
//		Class c=Demo.class;
//		System.out.println("class name is  "+ c);
//	}
//
//}
/*
public class Test
{
	public static void main(String[] args) {
		Demo dobj= new Demo();
		Class c=dobj.getClass();
		System.out.println("The Class Name is "+ c);
	}
}
*/
public class Test
{
	public static void main(String[] args) throws ClassNotFoundException  {
		Class c=Class.forName("String");
		System.out.println("The class Name is "+ c);
	}
}
