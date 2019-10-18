import java.io.*;
import java.util.regex.*;

public class App
{

	public static void main(String[] args)
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String message = "empty";
		Pattern mail = Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}", Pattern.CASE_INSENSITIVE);
		
		
		System.out.println("Input your name and email:");
		
		boolean gotMail = false;
		while(!gotMail)
		{
			try
			{
				message = in.readLine();
				Matcher m = mail.matcher(message);
				while (m.find())
				{
					System.out.print("You email is: ");
					System.out.println(m.group());
					gotMail = true;
				}
			}
			catch (Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		
		
		
	}
}
