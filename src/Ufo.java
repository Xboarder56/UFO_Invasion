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
	public static final int shipX = 80; public static final int shipY = 45; 
	public static final int startX=50; public static final int startY=50;
	public static final int shipTopX = 55; public static final int shipTopY = 40;  
	public static final int topOffSetX = 12;public static final int topOffSetY = 15; 
	public static final int arcOffSetX = 15; public static final int arcOffSetY = 5; 
	public static final int legX = 15; public static final int legY = 25; 
	public static final int legOffSetX = 8;public static final int legOffSetY = 30; 
	
	public Ufo()
	{
		
		createUFO();
	}
	
	private void createUFO()
	{
		/**Creates the body of the UFO (the main section)*/
		GOval mainShip = new GOval(shipX, shipY);
		mainShip.setLocation(startX,startY);
		mainShip.setFillColor(Color.RED);
		mainShip.setFilled(true);
		add(mainShip);
		
		/**Creates the top clear section of the UFO (top windshield)*/
		GOval topShip = new GOval(shipTopX, shipTopY);
		topShip.setLocation(startX+topOffSetX,startY-topOffSetY);
		topShip.setFillColor(Color.WHITE);
		topShip.setFilled(true);
		add(topShip);
		
		/**Creates the alien  (No variable because could be any alien)*/
		GArc alien = new GArc(50, 30, 40, 40);
		alien.setLocation(startX+arcOffSetX,startY-arcOffSetY);
		alien.setFillColor(Color.GREEN);
		alien.setFilled(true);
		add(alien);
		
		/**Creates the left leg of the UFO*/
		GRect shipLegLeft  = new GRect(legX, legY);
		shipLegLeft.setLocation(startX+legOffSetX,startY+legOffSetY);
		shipLegLeft.setFillColor(Color.BLACK);
		shipLegLeft.setFilled(true);
		add(shipLegLeft);
		
		/**Creates the right leg of the UFO*/
		GRect shipLegRight  = new GRect(legX, legY);
		shipLegRight.setLocation(((startX*2)+legOffSetX),startY+legOffSetY);
		shipLegRight.setFillColor(Color.BLACK);
		shipLegRight.setFilled(true);
		add(shipLegRight);
		
		
	}
	
}
	
	