
public class B extends A
{
	public int x = 11;

	public int getX()
	{
		return this.x;
	}

	public int getSuperX()
	{
		return super.x;
	}

	/* This will not work
	 * @Override public void print() {}
	 */
}
