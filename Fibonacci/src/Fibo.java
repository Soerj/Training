import java.util.*;

public class Fibo
{
	private int ind = 0;// index
	private long a, b;   // the last 2 numbers before [index] element
	private long fibonacci;
	
	public Fibo()
	{
		ind++;
		a = 1;
		fibonacci = 1;
	}
	
	public Fibo next()
	{
		ind++;
		if (ind == 2)
		{
			b = 1;
			fibonacci = 1;
		}
		else if (ind == 3)
		{
			fibonacci = a + b;
		}
		else if (ind > 3)
		{
			a = b;
			b = fibonacci;
			fibonacci = a + b;
		}
		return this;
	}
	
	public long getFibonacci()
	{
		return fibonacci;
	}
	
	public long getNumberAt(int index)
	{
		Fibo f = new Fibo();
		for (int i = 1; i < index; i++)
		{
			f.next();
		}
		return f.getFibonacci();
	}

}
