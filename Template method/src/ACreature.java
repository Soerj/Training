
public abstract class ACreature
{
	public void run()
	{
		System.out.println("run, fools");
	}
	public abstract void attack();
	public void act()
	{
		attack();
		run();
	}
}

class Fighter extends ACreature
{
	@Override
	public void attack()
	{
		System.out.println("Fighter hits");
	}
}

class Mage extends ACreature
{
	@Override
	public void attack()
	{
		System.out.println("Mage casts fire ball");
	}
}