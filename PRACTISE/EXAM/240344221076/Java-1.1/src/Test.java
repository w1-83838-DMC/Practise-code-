import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;import javax.print.attribute.Size2DSyntax;

public class Test {
	public static void main(String[] args) {
	item item1= new item("Ajay",6.9,8);
	item item2= new item("jay",7.8,9);
	item item3= new item("yash",5.7,10);
	List<item>ls= new ArrayList<item>();
	ls.add(item1);
	ls.add(item2);
	ls.add(item3);
	try
	{
		int choice;
		do
		{
			System.out.println("1. add 2. Retrive 3. searchByname 4. Removeitem  5.Display 6.calculate all products 7. Product of salary   ");
			Scanner sc= new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Adding ");
					//item.accepct();
					break;
				case 2:
					System.out.println("Retrive :");
					for(item i: ls)
					{
						System.out.println(i);
					}
					break;
				case 3:
					System.out.println("Search By name");
					String name=sc.next();
					for(int i=0; i<ls.size(); i++)
					{
						System.out.println(name.equals(ls));
					}
					break;
				case 4:
					System.out.println("Remove item ");
					int index=sc.nextInt();
					ls.remove(index);
					break;
				case 5:
					System.out.println("To display all items ");
					for(item i: ls)
					{
						System.out.println(i);
					}
					break;
				case 6:
					System.out.println("additio of salary: ");
					double total=0;
					double salary=0;
					for(item i:ls)
					{
						salary=i.getPrice();
						total=total+salary;
					}
					System.out.println("Total is "+ total);
				
				case 7:
					double product=1;
					System.out.println("Product of salary :");
					for(item i: ls)
					{
						product=product*i.getPrice();
					}
					System.out.println("Product of price is "+ product);
					
			}
	}while(choice!=0);
	}catch(Exception e)
	{
		System.out.println("Ecxepction is ocuured please enter the choice:  ");
		
	}
   }
}
