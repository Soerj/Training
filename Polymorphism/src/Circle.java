
public class Circle extends Shape
{
	public void draw()
	{
		System.out.println("draw circle");
	}

	@Override
	public String toString()
	{
		return "Circle";
	}
	
	public void print()
	{
		System.out.println("public print");
	}
}
