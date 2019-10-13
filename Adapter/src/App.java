import Classes.*;

public class App
{
	public static void main(String[] args)
	{
		Worker.doJob(new Adder(), "Note: ");
		
		Worker.doJob(new Splitter(), "had a few spaces here");
		
		Worker.doJob(new Adapter(), "my spoon is too big");
	}
}
