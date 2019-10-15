package Classes;

import Interfaces.IApple;

public class Basket
{
	protected class RedApple implements IApple
	{
		public RedApple(){}

		@Override
		public String color()
		{
			return "Red apple";
		}
	}
}
