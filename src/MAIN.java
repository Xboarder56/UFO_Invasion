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
		
		
		int windowX=800; int windowY=800;  int streetX=800; int streetY=100;
		GRect mainStreet = new GRect(streetX,streetY);
		mainStreet.setLocation(windowX-streetX,windowY-streetY);
		mainStreet.setFillColor(Color.gray);
		mainStreet.setFilled(true);
		add(mainStreet);
		
		int sideWalkX = 800; int sideWalkY = 20;
		GRect sideWalk = new GRect(sideWalkX,sideWalkY);
		sideWalk.setLocation(windowX-sideWalkX,(windowY-streetY)-sideWalkY);
		sideWalk.setFillColor(Color.BLACK);
		sideWalk.setFilled(true);
		add(sideWalk);
	}
	
	public void run()
	{
	    /**Creates the beam that comes from the ship.*/
	    GPolygon beam = new GPolygon();
	    beam.addEdge(10, 0);
	    beam.addEdge(-10, 25);
	    beam.addEdge(20, 0);
	    beam.setLocation((WINDOW_X/2)+50,200);
	    beam.setColor(Color.WHITE);
	    beam.setFilled(true);
	    add(beam);
		
		UFO UFO = new UFO();
		add(UFO);
		Building building1 = new Building(Color.gray, 100,150,50,530);
		add(building1);
		
		Building building2 = new Building(Color.ORANGE, 100,150,480,530);
		add(building2);
		
		Building building3 = new Building(Color.BLUE, 100,150,300,530);
		add(building3);
		
		Building building4 = new Building(Color.CYAN, 100,150,650,530);
		add(building4);
		
		
		
	    /**Animates the UFO half way through the window*/
	    for(int i=1; i<(WINDOW_X/2); i++)
	    {
	        UFO.move(1, 0.3);
	        pause(15);
	    }
	    
	    beam.setColor(Color.YELLOW);
	    
	    for(int i=1; i<(WINDOW_Y/2); i++)
	    {
	    	beam.scale(1.005, 1.0074);
	    	pause(10);
	    }
	    
	    remove(building2);
	    
	    for(int i=1; i<(WINDOW_Y/2); i++)
	    {
	    	beam.scale(0.98);
	    	pause(10);
	    }
	    

	    /**Animates the UFO half way through the window*/
	    for(int i=1; i<(WINDOW_X/2); i++)
	    {
	        UFO.move(1, -0.3);
	        pause(15);
	    }
	}
}
