/**
 * MAIN.java
 * @author Garrett J. Beasley
 * 11/01/2014
 * Main class for lunching Building and UFO
 */

/** Imports for the project */
import java.awt.Color;
import acm.graphics.*;
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
		
		
		
	    /**Animates the UFO half way through the window*/
	    for(int i=1; i<(WINDOW_X/2); i++)
	    {
	        UFO.move(1, 0.3);
	        pause(15);
	    }

	    /**Creates the beam that comes from the ship.*/
	    GPolygon beam = new GPolygon();
	    beam.addEdge(10, 0);
	    beam.addEdge(-10, 25);
	    beam.addEdge(20, 0);
	    beam.setLocation((WINDOW_X/2)+50,200);
	    beam.setColor(Color.YELLOW);
	    beam.setFilled(true);
	    add(beam);
	    
	    for(int i=1; i<(WINDOW_Y/2); i++)
	    {
	    	beam.scale(1.005, 1.0074);
	    	pause(10);
	    }
	    
	    for(int i=1; i<(WINDOW_Y/2); i++)
	    {
	    	beam.scale(0.98);
	    	pause(15);
	    }
	    

	    /**Animates the UFO half way through the window*/
	    for(int i=1; i<(WINDOW_X/2); i++)
	    {
	        UFO.move(1, -0.3);
	        pause(15);
	    }
	}
}
