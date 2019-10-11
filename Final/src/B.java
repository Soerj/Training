
public class B extends A
{
	public int x = 11;

	public void printBx()
	{
		System.out.println(x);
	}

	public void printAx()
	{
		super.print();
	}

	/* This will not work
	 * @Override public void print() {}
	 */
}
