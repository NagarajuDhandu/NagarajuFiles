package org.Techouts;


public class PlayGame {

	public static void main(String[] args) 
	{
		Football fb = new Football();
		Player1 p1 = new Player1(fb);
		Player2 p2 = new Player2(fb);
		p1.start();
		p2.start();
	}

}
