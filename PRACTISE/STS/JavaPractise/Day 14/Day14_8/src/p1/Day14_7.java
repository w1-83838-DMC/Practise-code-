package p1;

import java.lang.annotation.Annotation;

public class Day14_7 {
	public static void main(String[] args) {
		Class c=Book.class;
		Annotation arr[]=c.getAnnotations();
		
		for(Annotation a: arr)
		{
			System.out.println(a);
		}
	}
	

}
