package org.Techouts;


public class Player2 extends Thread
{
Football fb;
	
	public Player2(Football fb)
	{
		this.fb=fb;
	}
	
	@Override
	public void run()
	{
		fb.pass();
		/*try 
		{
			fb.pass();
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}*/
	}
}
