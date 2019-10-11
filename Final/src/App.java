
public class App
{

	public static void main(String[] args)
	{
		B derived = new B();
		System.out.println(derived.getX());
		System.out.println(derived.getSuperX());
		
		derived.x = 0;
		System.out.println(derived.getX());
		System.out.println(derived.getSuperX());
	}

}
