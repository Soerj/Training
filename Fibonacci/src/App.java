
public class App
{

	public static void main(String[] args)
	{
		Fibo f = new Fibo();
		System.out.println(f.getFibonacci());
		for (int i = 0; i < 91; i++)
		{
			System.out.println(f.next().getFibonacci());
		}
	}

}
