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
	public static final int SIDEWALK_X = 800; public static final int SIDEWALK_Y = 20;
	public static final int STREET_X=800; public static final int STREET_Y=100;
	
	/**Create Objects for the whole class to use.*/
	Ufo UFO = new Ufo();
    GPolygon beam = new GPolygon();
	GRect mainStreet = new GRect(STREET_X,STREET_Y);
	GRect sideWalk = new GRect(SIDEWALK_X,SIDEWALK_Y);
	Building building1 = new Building(Color.gray, 100,150,50,530);
	Building building2 = new Building(Color.ORANGE, 100,150,480,530);
	Building building3 = new Building(Color.BLUE, 100,310,300,370);
	Building building4 = new Building(Color.CYAN, 100,250,650,430);	
	Building building5 = new Building(Color.GREEN, 100,210,180,470);
	
	public void init()
	{
		/**Set the size of the applet*/
		setSize(WINDOW_X,WINDOW_Y);
		
		
		/**Creates the road for the project with set size at the top of the code*/
		mainStreet.setLocation(WINDOW_X-STREET_X,WINDOW_Y-STREET_Y);
		mainStreet.setFillColor(Color.gray);
		mainStreet.setFilled(true);
		add(mainStreet);
		
		/**Creates the sidewalk for the project with set size at the top of the code*/
		sideWalk.setLocation(WINDOW_X-SIDEWALK_X,(WINDOW_Y-STREET_Y)-SIDEWALK_Y);
		sideWalk.setFillColor(Color.BLACK);
		sideWalk.setFilled(true);
		add(sideWalk);
	}
	
	public void run()
	{
		/**Adds methods to the project */
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
	    
	    /**Adds the created objects to the project*/
	    add(beam); add(UFO); add(building1); add(building2); add(building3); add(building4);  add(building5);
	    
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
	    /**Makes the beam visible.*/
	    beam.setColor(Color.YELLOW);
	    /**Animates the beam to the top of the building 2.*/
	    for(int i=1; i<(WINDOW_Y/2); i++)
	    {
	    	beam.scale(1.005, 1.0074);
	    	pause(10);
	    }
	    
	    /**Removes Building after beam grabs it*/
	    remove(building2);
	    
	    /**Animates the beam to the top of the ship.*/
	    for(int i=1; i<(WINDOW_Y/2); i+=2)
	    {
	    	beam.scale(0.98);
	    	pause(10);
	    }
	    /**Removes beam after beam goes to the top of the ship*/    
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
