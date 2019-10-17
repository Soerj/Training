
public class App
{

	public static void main(String[] args)
	{
		Thrower t = new Thrower();
		try
		{
			t.thrw();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("got it");
		}
	}

}
