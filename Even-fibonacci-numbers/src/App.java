//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class App
{

	public static void main(String[] args)
	{
		Fibo f = new Fibo();
		long sum = 0;
		long a;
		
		while (f.getFibonacci() <= 4000000)
		{
			if (f.getFibonacci() % 2 == 0)
			{
				sum += f.getFibonacci();
			}
			f.next();
		}
		
		System.out.println(sum);
	}

}
