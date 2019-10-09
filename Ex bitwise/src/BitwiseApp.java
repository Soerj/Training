
public class BitwiseApp
{

	public static void main(String[] args)
	{
		int i = -1;
		System.out.println("int " + i + " = " + Integer.toBinaryString(i));
		i >>>= 10;
		System.out.println("int " + i + " = " + Integer.toBinaryString(i));
		long l = -1;
		System.out.println("long " + l + " = " + Long.toBinaryString(l));
		l >>>= 10;
		System.out.println("long " + l + " = " + Long.toBinaryString(l));
		short s = -1;
		System.out.println("short " + s + " = " + Integer.toBinaryString(s));
		s >>>= 10;
		System.out.println("short " + s + " = " + Integer.toBinaryString(s));
		byte b = -1;
		System.out.println("byte " + b + " = " + Integer.toBinaryString(b));
		b >>>= 10;
		System.out.println("byte " + b + " = " + Integer.toBinaryString(b));
		b = -1;
		System.out.println("byte " + b + " = " + Integer.toBinaryString(b));
		System.out.println("byte " + (b >>> 10) + " = " + Integer.toBinaryString(b >>> 10));
		
		int j = 1;
		while (j > 0)
		{
			j = j >>> 1;
			System.out.println(Integer.toBinaryString(j));
		}
	}

}
