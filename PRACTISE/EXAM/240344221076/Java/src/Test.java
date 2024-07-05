
import java.util.Scanner;
import java.util.ArrayList;
public class Test {
	
	public static void main(String[] args) {
	
	ArrayList<item> al = new ArrayList<item>();
		
	
	int choice=0;
	System.out.println("1. add 2. Retrive 3. searchableName  4.name 5. Remove Items 6. calculate all product price  ");
	Scanner sc= new Scanner(System.in);
	

//	item it1= new item(sc.next(),sc.nextDouble(),sc.nextInt());
//	item it2= new item(sc.next(),sc.nextDouble(),sc.nextInt());
//	item it3= new item(sc.next(),sc.nextDouble(),sc.nextInt());

//	al.add(it1);
//	al.add(it2);
//	al.add(it3);
	double total=0;
	do
	{
		accepct(al);
		
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				for(item i: al)
				{
					//System.out.println("Total price is  : ");
					double price = (i.getPrice());
					total= total+price;
				}
				System.out.println("Total "+ total);
		break;
		
		case 2:
				System.out.println("Fetch the data : ");
				for(item i: al)
				{
					System.out.println(i.getName());
				}
					break;
		case 3:
				System.out.println("Search by name : ");
				for(item i: al)
				{
					System.out.println("Enter the name : ");
					String name=sc.next();
					
					boolean b=al.equals(name);
					System.out.println(b);
				}
			
				break;
			
		case 4:
				System.out.println("Enter the index: ");
				int index= sc.nextInt();
				al.remove(index);
				for(item i: al)
				{
				System.out.println("Removed item : "+ i);
				}
				break;
		
		case 5:
				System.out.println("Calculate all products price  : ");
				double product=1;
				for(item i: al)
				{
					product= product*i.getPrice();
				}
				System.out.println("product "+ product);
				break;		
			
		}
	
	
	}while(choice !=0);
  }

}
