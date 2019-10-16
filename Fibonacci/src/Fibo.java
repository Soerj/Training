import java.util.*;

public class Fibo
{
	private long ind = 0;// index
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
	
	public long getNumberAt(long index)
	{
		Fibo f = new Fibo();
		for (long i = 1; i < index; i++)
		{
			f.next();
		}
		return f.getFibonacci();
	}

}
