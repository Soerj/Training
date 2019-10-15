
public class App
{

	public static void main(String[] args)
	{
		Profile profile = new Profile(Profile.Grade.NEWBIE);
		profile.printProfileInfo();
		
		Profile profile1 = new Profile(Profile.Grade.MIDDLE);
		profile1.printProfileInfo();
	}

}
