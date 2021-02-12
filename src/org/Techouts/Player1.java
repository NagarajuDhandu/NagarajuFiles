package org.Techouts;


public class Player1 extends Thread
{
Football fb;
	
	public Player1(Football fb)
	{
		this.fb=fb;
	}
	
	@Override
	public void run()
	{
		fb.kick();
	}
}
