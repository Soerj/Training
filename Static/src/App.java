
public class App
{

	public static void main(String[] args)
	{
		demo a = new demo(),
				b = new demo();
		System.out.println("A values:");
		a.print();
		System.out.println("B values:");
		b.print();
		System.out.println("Changing A.stat to 11");
		a.setStat(11);
		System.out.println("Changing A.nonStat to 4");
		a.setNonStat(4);
		
		System.out.println("A values:");
		a.print();
		System.out.println("B values:");
		b.print();

	}

}
