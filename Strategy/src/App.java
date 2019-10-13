import Classes.*;

public class App
{

	public static void main(String[] args)
	{
		Car c = new Car();
		
		c.brake(new BrakeWithABS());
		c.brake(new BrakeWithoutABS());
	}

}
