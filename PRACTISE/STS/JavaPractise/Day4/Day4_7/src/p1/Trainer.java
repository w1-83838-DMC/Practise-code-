package p1;

public class Trainer {
	String name;
	String module;
	
	public Trainer() // parameterless constructor
	{
		this.name="Ajay";
		this.module="DMC";
	}
	public Trainer(String name, String module)
	{
		this.name=name;
		this.module=module;
	}
	public String toString()
	{
		return "Trainer Name- " + this.name + " Trainer Module- "+ this.module; 
	}

}
