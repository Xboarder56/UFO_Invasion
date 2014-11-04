/**
 * Building.java
 * @author Garrett J. Beasley
 * 11/01/2014
 * Building class for making building GCompound
 */

/** Imports for the project */
import java.awt.Color;
import acm.graphics.GCompound;
import acm.graphics.*;


public class Building extends GCompound
{
	private Color mColor;
	private double width;
	private double height;
	private double startX;
	private double startY;
	
	public Building(Color color, double x,double y,double locationX,double locationY)
	{
		mColor = color;
		width = x;
		height = y;
		startX = locationX;
		startY = locationY;
		createBuilding();
	}

	
	private void createBuilding()
	{
		GRect building = new GRect(width,height);
		building.setLocation(startX,startY);
		building.setFillColor(mColor);
		building.setFilled(true);
		add(building);
		
		int doorX = 15; int doorY = 20;
		GRect door = new GRect(doorX,doorY);
		door.setLocation(startX+((width-doorX)/2),startY+height-(doorY));
		door.setFillColor(Color.BLACK);
		door.setFilled(true);
		add(door);
		
		int windowSep =0;
		for(int i=1; i<8; i++)
		{
			GRect window = new GRect(10,10);
			window.setLocation(startX+windowSep,startY+5);
			window.setFillColor(Color.RED);
			window.setFilled(true);
			add(window);
			
			windowSep+=15;
		}
		
	}
}
