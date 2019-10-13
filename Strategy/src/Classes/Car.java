package Classes;
import Interfaces.*;

public class Car
{
	public String name;
	
	public void brake(IBrake b)
	{
		b.brake();
	}

}
