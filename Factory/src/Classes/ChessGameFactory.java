package Classes;

import Interfaces.IGame;
import Interfaces.IGameFactory;

public class ChessGameFactory implements IGameFactory
{

	@Override
	public IGame getGame()
	{
		return new Chess();
	}

}
