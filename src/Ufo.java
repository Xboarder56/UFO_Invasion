/**
 * UFO.java
 * @author Garrett J. Beasley
 * 11/01/2014
 * UFO class for making UFO GCompound
 */

/** Imports for the project */
import java.awt.Color;
import acm.graphics.GCompound;
import acm.graphics.*;


public class Ufo extends GCompound
{
	/**Static Variables because the ufo will not chance in the program*/
	public static final int SHIP_X = 80; public static final int SHIP_Y = 45; 
	public static final int START_X=50; public static final int START_Y=50;
	public static final int SHIP_TOP_X = 55; public static final int SHIP_TOP_Y = 40;  
	public static final int TOP_OFF_SET_X = 12;public static final int TOP_OFF_SET_Y = 15; 
	public static final int ARC_OFF_SET_X = 15; public static final int ARC_OFF_SET_Y = 5; 
	public static final int LEG_X = 15; public static final int LEG_Y = 25; 
	public static final int LEG_OFF_SET_X = 8;public static final int LEG_OFF_SET_Y = 30; 
	
	public Ufo()
	{
		
		createUFO();
	}
	
	private void createUFO()
	{
		/**Creates the body of the UFO (the main section)*/
		GOval mainShip = new GOval(SHIP_X, SHIP_Y);
		mainShip.setLocation(START_X,START_Y);
		mainShip.setFillColor(Color.RED);
		mainShip.setFilled(true);
		add(mainShip);
		
		/**Creates the top clear section of the UFO (top windshield)*/
		GOval topShip = new GOval(SHIP_TOP_X, SHIP_TOP_Y);
		topShip.setLocation(START_X+TOP_OFF_SET_X,START_Y-TOP_OFF_SET_Y);
		topShip.setFillColor(Color.WHITE);
		topShip.setFilled(true);
		add(topShip);
		
		/**Creates the alien  (No variable because could be any alien)*/
		GArc alien = new GArc(50, 30, 40, 40);
		alien.setLocation(START_X+ARC_OFF_SET_X,START_Y-ARC_OFF_SET_Y);
		alien.setFillColor(Color.GREEN);
		alien.setFilled(true);
		add(alien);
		
		/**Creates the left leg of the UFO*/
		GRect shipLegLeft  = new GRect(LEG_X, LEG_Y);
		shipLegLeft.setLocation(START_X+LEG_OFF_SET_X,START_Y+LEG_OFF_SET_Y);
		shipLegLeft.setFillColor(Color.BLACK);
		shipLegLeft.setFilled(true);
		add(shipLegLeft);
		
		/**Creates the right leg of the UFO*/
		GRect shipLegRight  = new GRect(LEG_X, LEG_Y);
		shipLegRight.setLocation(((START_X*2)+LEG_OFF_SET_X),START_Y+LEG_OFF_SET_Y);
		shipLegRight.setFillColor(Color.BLACK);
		shipLegRight.setFilled(true);
		add(shipLegRight);
		
		
	}
	
}
	
	