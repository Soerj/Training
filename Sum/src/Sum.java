
public class Sum
{

	public static void main(String[] args)
	{
		int n = 150;
		System.out.println(count(n));
	}

	public static int count(int n)
	{
		if (n > 0)
			return n + count(n - 1);
		else
			return 0;
	}
}
