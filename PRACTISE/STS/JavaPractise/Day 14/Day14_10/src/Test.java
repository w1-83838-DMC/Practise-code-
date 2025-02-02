// fetch the metadata about constructor

import java.text.DateFormat.Field;
import java.lang.reflect.*;

class ReflectionDemo
{
	private String str;
	public int value;
	
	public ReflectionDemo() {
		super();
		
	}
	public ReflectionDemo(String str, int value) {
		super();
		this.str = str;
		this.value=value;
		
	}
	
	public void m1()
	{
		System.out.println("Inside Method m1");
	}
	public void m2(int num)
	{
		System.out.println("Inside Method m2"+num);
	}
	private void m3()
	{
		System.out.println("Private inside m3");
	}
	
}
/*
public class Test
{
	public static void main(String[] args) {
		Class c=ReflectionDemo.class;
		Constructor ctarr[]=c.getConstructors();
		for(Constructor Re:ctarr)
		{
			System.out.println(Re);
			
		}
		System.out.println("-----------------getDeclaredConstructor-------------------");
		Constructor ctarr1[]=c.getDeclaredConstructors();
		for(Constructor Ree: ctarr1)
		{
			System.out.println(Ree);
		}
		
	}
}
*/
// fetch data about fileds
/*
public class Test
{
	public static void main(String[] args) throws ClassNotFoundException {
		Class c=Class.forName("ReflectionDemo");
		java.lang.reflect.Field[] ff1=c.getFields();
		for(java.lang.reflect.Field f1:ff1)
		{
			System.out.println(f1);
		}
		
		
	}
}
*/
/*
public class Test
{
	public static void main(String[] args) {
		ReflectionDemo obj= new ReflectionDemo();
		Class c=obj.getClass();
		Method marr1[]=c.getMethods();
		// it gives public method declared inside class along with public
		// methods of super class
		for(Method i: marr1)
		{
			System.out.println(i);
		}
		System.out.println("--------------------------------------");
		Method marr2[]=c.getDeclaredMethods();
		for(Method m: marr2)
		{
			System.out.println(m);
		}
			
	}
}
*/
public class Test
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ReflectionDemo dobj= new ReflectionDemo();
		Class c=dobj.getClass();
		Method marr1[]=c.getDeclaredMethods();
		// it gives all method declared insode class
		for(Method m:marr1)
		{
			System.out.println(m);
		}
		System.out.println("------------------");
		Method m1=c.getDeclaredMethod("m1");
		m1.invoke(dobj);
		System.out.println("---------------------");
		Method m2=c.getDeclaredMethod("m2",int.class);
		m2.invoke(dobj, 45);
		System.out.println("------------------------");
		Method m3=c.getDeclaredMethod("m3");
		m3.setAccessible(true);
		m3.invoke(dobj);
		
		
		
	}
}
