package Classes;

import Interfaces.IGame;

public class Chess implements IGame
{
	private int move = 0;
	private static int MAX_MOVES = 5;
	
	@Override
	public boolean play()
	{
		System.out.println("Chess move " + move);
		return ++move < MAX_MOVES;
	}

}
