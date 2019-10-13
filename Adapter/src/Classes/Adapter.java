package Classes;

import Interfaces.*;

//combines the functionality of a Jack class with flexibility of Processor interface
public class Adapter implements Processor
{
	Jack j = new Jack();
	
	public String name()
	{
		return getClass().getSimpleName();
	}
	
	public String process(String obj)
	{
		return j.doSomeStuff(obj);
	}
}
