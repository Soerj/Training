package Classes;

import Interfaces.*;

public class BrakeWithoutABS implements IBrake
{
	public void brake()
	{
		System.out.println("Braking without ABS");
	}
}
