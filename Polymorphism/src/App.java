
public class App
{

	public static void main(String[] args)
	{
		Shape s = new Shape();
		Shape c = new Circle();
		Shape r = new Rectangle();
		
		Shape[] sp = {s, c, r};
		Shape.drawShapes(sp);
		
		System.out.println(s + ", " + c + ", " + r);

		Shape.magic(c);
		/* 
		 * Circle class "overrides" print() method
		 * but Shape.magic still calls the private version of this method in the base class
		 * so the public print() in the Circle class is actually a brand new method
		 * it's not even overloaded
		 */
		
	}

}
