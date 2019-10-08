
public class BitwiseApp
{

	public static void main(String[] args)
	{
		int h = 7;
		System.out.println(h + " = " + Integer.toBinaryString(h));
		h++;
		System.out.println(h + " = " + Integer.toBinaryString(h));
		h = h>>1;
		System.out.println(h + " = " + Integer.toBinaryString(h));
		h *= 3;
		System.out.println(h + " = " + Integer.toBinaryString(h));
		h = h<<2;
		System.out.println(h + " = " + Integer.toBinaryString(h));
	}

}
