/* In this case balance filed is not initialized with any value so by default the value is 0 */
/*
class Account
{
	static int balance;
	
	static void deposit()
	{
		balance=balance+3000;
	}
	static void withdrawl()
	{
		balance=balance-500;
	}
	static void display()
	{
		System.out.println("balance = "+ balance);
		
	}
	public String toString()
	{
		return "Balance = " + this.balance;
	}
	
}
public class Day5_3 {
	public static void main(String[] args) {
//		Account a1= new Account();
//		a1.deposit();
//		a1.withdrawl();
//		System.out.println(a1);
		Account.deposit();
		Account.display();
		Account.withdrawl();
		Account.display();
		
		
	}

}
*/
/*
class Account
{
	static int balance=10000;
	
	static void deposite()
	{
		balance = balance + 2000;
		
	}
	static void withdrawl()
	{
		balance = balance-500;
	}
	static void display()
	{
		System.out.println("Balance is " + balance);
	}
	
}

public class Day5_3
{
	public static void main(String[] args) {
		Account.deposite();
		Account.display();
		Account.withdrawl();
		Account.display();
		
	}
	
}
*/
// static intializer block;
class Account
{
	static int balance;
	// static intializer block	
	static 
	{
		System.out.println("Inside static intializer block ");
		balance=2000;
		
		
	}
	Account()  // parameterless Constructor
	{
		System.out.println("Inside Parameterless Constructor ");
		
	}
	void deposite()
	{
		balance=balance+2000;
	}
	void withdrawl()
	{
		balance=balance-500;
	}
	public String toString()
	{
		return "Balance = " + this.balance;
	}
	
}
class Day5_3
{
	public static void main(String[] args) 
	{
		Account a1= new Account();
		a1.deposite();
		a1.withdrawl();
		System.out.println(a1);
	
		
	}
	
}


