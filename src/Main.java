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

public class Main extends GraphicsProgram
{
	
	/**Constant Window Size*/
	public static final int WINDOW_X = 800;
	public static final int WINDOW_Y = 800;
	public static final int sideWalkX = 800; public static final int sideWalkY = 20;
	public static final int streetX=800; public static final int streetY=100;
	
	/**Create Objects for the whole class to use.*/
	GRect mainStreet = new GRect(streetX,streetY);
	GRect sideWalk = new GRect(sideWalkX,sideWalkY);
	Building building1 = new Building(Color.gray, 100,150,50,530);
    GPolygon beam = new GPolygon();
	Ufo UFO = new Ufo();
	Building building2 = new Building(Color.ORANGE, 100,150,480,530);
	Building building3 = new Building(Color.BLUE, 100,150,300,530);
	Building building4 = new Building(Color.CYAN, 100,150,650,530);
	
	public void init()
	{
		/**Set the size of the applet*/
		setSize(WINDOW_X,WINDOW_Y);
		
		mainStreet.setLocation(WINDOW_X-streetX,WINDOW_Y-streetY);
		mainStreet.setFillColor(Color.gray);
		mainStreet.setFilled(true);
		add(mainStreet);
		
		sideWalk.setLocation(WINDOW_X-sideWalkX,(WINDOW_Y-streetY)-sideWalkY);
		sideWalk.setFillColor(Color.BLACK);
		sideWalk.setFilled(true);
		add(sideWalk);
	}
	
	public void run()
	{
		
		addObjects();
		ufoAppears();
	    ufoAttack();
	    ufoRetreat();
	}
	
	
    public void addObjects()  
    {
	    /**Creates the beam that comes from the ship.*/
	    beam.addEdge(10, 0);
	    beam.addEdge(-10, 25);
	    beam.addEdge(20, 0);
	    beam.setLocation((WINDOW_X/2)+50,200);
	    beam.setColor(Color.WHITE);
	    beam.setFilled(true);
	    add(beam); add(UFO); add(building1); add(building2); add(building3); add(building4);
    }
    
    
    public void ufoAppears()
    {
	    /**Animates the UFO half way through the window*/
	    for(int i=1; i<(WINDOW_X/2); i++)
	    {
	        UFO.move(1, 0.3);
	        pause(15);
	    }
    }
	
    
    public void ufoAttack()
    {
	    
	    beam.setColor(Color.YELLOW);
	    
	    for(int i=1; i<(WINDOW_Y/2); i++)
	    {
	    	beam.scale(1.005, 1.0074);
	    	pause(10);
	    }
	    
	    remove(building2);
	    
	    for(int i=1; i<(WINDOW_Y/2); i+=2)
	    {
	    	beam.scale(0.98);
	    	pause(10);
	    }
	    remove(beam);
    }
    
    
    public void ufoRetreat()
    {
	    /**Animates the UFO half way through the window*/
	    for(int i=1; i<(WINDOW_X/2); i++)
	    {
	        UFO.move(1, -0.3);
	        pause(15);
	    }
    }
}
