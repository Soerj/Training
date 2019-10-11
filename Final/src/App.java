
public class App
{

	public static void main(String[] args)
	{
		B derived = new B();
		derived.printBx();
		derived.printAx();
		derived.x = 99;
		derived.printBx();
		derived.printAx();
	}

}
