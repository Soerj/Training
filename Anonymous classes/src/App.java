
public class App
{

	public static void main(String[] args)
	{
		ICanFly airplain = new ICanFly()
		{

			@Override
			public void fly()
			{
				System.out.println("Plain flies");
			}
			
		};
		
		ICanFly bird = new ICanFly()
		{
			
			@Override
			public void fly()
			{
				System.out.println("Bird flies");
			}
		};
		
		airplain.fly();
		bird.fly();

	}

}
