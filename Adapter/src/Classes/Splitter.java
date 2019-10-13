package Classes;

import java.util.Arrays;

import Interfaces.*;

public class Splitter implements Processor
{
	public String name()
	{
		return getClass().getSimpleName();
	}
	
	public String process(String obj)
	{
		return Arrays.toString(obj.split(" "));
	}
}
