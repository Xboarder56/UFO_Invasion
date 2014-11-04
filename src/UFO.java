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


public class UFO extends GCompound
{
	
	public UFO()
	{
		
		createUFO();
	}
	
	private void createUFO()
	{
		int shipX = 80; int shipY = 45; int startX=50;int startY=50; 
		GOval mainShip = new GOval(shipX, shipY);
		mainShip.setLocation(startX,startY);
		mainShip.setFillColor(Color.RED);
		mainShip.setFilled(true);
		add(mainShip);
		
		
		int shipTopX = 55; int shipTopY = 40;  int topOffSetX = 12; int topOffSetY = 15;
		GOval topShip = new GOval(shipTopX, shipTopY);
		topShip.setLocation(startX+topOffSetX,startY-topOffSetY);
		topShip.setFillColor(Color.WHITE);
		topShip.setFilled(true);
		add(topShip);
		
		
		int arcOffSetX = 15; int arcOffSetY = 5;
		GArc alien = new GArc(50, 30, 40, 40);
		alien.setLocation(startX+arcOffSetX,startY-arcOffSetY);
		alien.setFillColor(Color.GREEN);
		alien.setFilled(true);
		add(alien);
		
		
		int legX = 15; int legY = 25; int legOffSetX = 8; int legOffSetY = 30; 
		GRect shipLegLeft  = new GRect(legX, legY);
		shipLegLeft.setLocation(startX+legOffSetX,startY+legOffSetY);
		shipLegLeft.setFillColor(Color.BLACK);
		shipLegLeft.setFilled(true);
		add(shipLegLeft);
		

		GRect shipLegRight  = new GRect(legX, legY);
		shipLegRight.setLocation(((startX*2)+legOffSetX),startY+legOffSetY);
		shipLegRight.setFillColor(Color.BLACK);
		shipLegRight.setFilled(true);
		add(shipLegRight);
		
		
	}
	
}
	
	