package ex1;

public class ex1
{
	public static void main(String[] args)
	{
		Ex ex = new Ex();
		System.out.println("Uninitialized int: " + ex.i);
		System.out.println("Uninitialized char: " + ex.c);
	}

}

class Ex
{
	public int i;
	public char c;

	public Ex()
	{

	}

}
