
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
}
