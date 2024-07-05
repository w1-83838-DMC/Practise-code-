import java.util.Objects;
import java.util.Scanner;

class item {
	
	private String name;
	private double price;
	private int quantity;
	
	
	public item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, price, quantity);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		item other = (item) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}



	public item(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}



	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void acceptData() {
		
	}
	
	public void accepct()
	{
		System.out.println("Enter the Name : ");
		Scanner sc=new Scanner(System.in);
		name =sc.next();
		System.out.println("Enter the Price ");
		price = sc.nextDouble();
		System.out.println("Enter the Quamtity : ");
		quantity= sc.nextInt();
	}
	

}
