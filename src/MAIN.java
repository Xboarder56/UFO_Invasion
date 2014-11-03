/**
 * Animated_Bubbles.java
 * @author Garrett J. Beasley
 * 10/06/2014
 * Draws a Bubbles that grow and move to the top of the screen
 */

/** Imports for the project */

import java.awt.Color;

import acm.program.GraphicsProgram;

public class MAIN extends GraphicsProgram
{
	
	/**Constant Window Size*/
	public static final int WINDOW_X = 800;
	public static final int WINDOW_Y = 800;
	
	public void init()
	{
		/**Set the size of the applet*/
		setSize(WINDOW_X,WINDOW_Y);
	}
	
	public void run()
	{
		UFO UFO = new UFO();
		add(UFO);
		Building building = new Building(Color.gray, 100,150);
		add(building);
	}
}
