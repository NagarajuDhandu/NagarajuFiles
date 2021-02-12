package org.Techouts;

public class Football {

	synchronized public void kick()
	{

		try 
		{
			wait();
			Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}

		System.out.println("Kick the ball....");
		System.out.println();
		System.out.println("Goal...................................");
	}

	synchronized public void pass() 	{
		System.out.println("Wait for 2 Seconds....");
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
		System.out.println("pass the ball....");
		System.out.println("Wait for 3 seconds......");
		notify();
	}

}
