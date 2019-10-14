package Classes;

import Interfaces.IGame;
import Interfaces.IGameFactory;

public class CheckersGameFactory implements IGameFactory
{

	@Override
	public IGame getGame()
	{
		return new Checkers();
	}

}
