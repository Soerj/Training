package Classes;

import Interfaces.Processor;

public class Adder implements Processor
{
	
	public String name()
	{
		return getClass().getSimpleName();
	}
	
	public String process(String obj)
	{
		return obj+"useless text added";
	}

}
