package Classes;

import Interfaces.*;

public class Worker
{
	public static void doJob(Processor process, String obj)
	{
		System.out.println(process.name());
		System.out.println(process.process(obj));
	}
}
