package Classes;

import Interfaces.IGame;

public class Checkers implements IGame
{
	private int move = 0;
	private static int MAX_MOVES = 2;
	
	@Override
	public boolean play()
	{
		System.out.println("Checkers move " + move);
		return ++move < MAX_MOVES;
	}
}
