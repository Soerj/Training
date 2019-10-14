import Classes.*;

public class App
{

	public static void main(String[] args)
	{
		Games.playGame(new ChessGameFactory());
		System.out.println("------------");
		
		Games.playGame(new CheckersGameFactory());
	}

}
