
public class Shape
{
	public void draw()
	{
		System.out.println("draw shape");
	}

	public static void drawShapes(Shape[] shapes)
	{
		for (Shape s : shapes)
		{
			s.draw();
		}

	}
	
	/*
	 * @Override public String toString() { return "Shape"; }
	 */
	
	public static void magic(Shape s)
	{
		s.print();
	}
	
	private void print()
	{
		System.out.println("private print");
	}
}
