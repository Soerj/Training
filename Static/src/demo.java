
public class demo
{
	private static int stat;
	private int nonStat;
	
	public demo()
	{
		stat = 1;
		nonStat = 2;
	}
	
	public void setStat(int v)
	{
		this.stat = v;
	}
	public int getStat()
	{
		return this.stat;
	}
	
	public void setNonStat(int v)
	{
		this.nonStat = v;
	}
	public int getNonStat()
	{
		return this.nonStat;
	}
	
	public void print ()
	{
		System.out.print("stat " + this.stat + ", ");
		System.out.println("nonStat " +this.nonStat);
	}
}
