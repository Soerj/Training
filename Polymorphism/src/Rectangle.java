
public class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("draw rectangle");
	}
	
	@Override
	public String toString()
	{
		return "Rectangle";
	}
	
	public void print()
	{
		System.out.println("public print");
	}
}
