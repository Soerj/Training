import Classes.Basket;
import Interfaces.IApple;

public class BigBasket extends Basket
{
	public IApple getRedApple()
	{
		return new RedApple();
	}
}
