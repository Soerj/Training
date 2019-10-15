
public class App
{

	public static void main(String[] args)
	{
		ACreature mage = new Mage();
		ACreature fighter = new Fighter();
		
		mage.act();
		System.out.println("-------------------------");
		fighter.act();
	}

}
