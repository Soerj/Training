package Classes;

import Interfaces.IGame;
import Interfaces.IGameFactory;

public class Games
{
	public static void playGame(IGameFactory gameFactory)
	{
		System.out.println("drawing a board...");
		IGame game = gameFactory.getGame();
		while (game.play()) {}
	}
	
}
