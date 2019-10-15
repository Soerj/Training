
public class Profile
{
	private Grade grade;
	
	public Profile(Grade a)
	{
		setAttribute(a);
	}
	
	public enum Grade
	{
		NEWBIE, MIDDLE, SKILLED, PRO;
	}
	
	public void setAttribute(Grade a)
	{
		this.grade = a;
	}
	
	public void printProfileInfo()
	{
		System.out.println(this.toString() + "\n" + "Grade: " + this.grade.toString().toLowerCase());
	}
}
