
public class App
{

	public static void main(String[] args)
	{
		Shape s = new Shape();
		Shape c = new Circle();
		Shape r = new Rectangle();
		
		Shape[] sp = {s, c, r};
		Shape.drawShapes(sp);

	}

}
