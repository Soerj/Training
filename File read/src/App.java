import java.io.*;

public class App
{

	public static void main(String[] args)
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
			
			String s;
			while ((s = reader.readLine()) != null)
			{
				System.out.println(s);
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
