
public class Vehicle
{
	private int durability;
	public Vehicle()
	{
		System.out.println("Base class constructor");
		durability = 100;
	}

	public void move() 
	{
		this.durability -= 1;
		System.out.println(this + " durability = " + this.durability);
	}
	
	public static Vehicle repair(Vehicle v)
	{
		v.durability = 100;
		System.out.println("Vehicle repaired");
		return v;
	}

}
