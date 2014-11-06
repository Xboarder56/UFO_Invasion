/**
 * Building.java
 * @author Garrett J. Beasley
 * 11/01/2014
 * Building class for making building GCompound
 */

/** Imports for the project */
import java.awt.Color;

import acm.graphics.*;


public class Building extends GCompound
{
	/**Variables*/
	private Color mColor;
	private double width; private double height;
	private double startX; private double startY;
	public static final int DOOR_X = 15; public static final int DOOR_Y = 20; public static final int WINDOW_SIZE = 10;
	
	/**Creates the building class with the inputs for the parameters*/
	public Building(Color color, double x,double y,double locationX,double locationY)
	{
		/**Takes the inputs from the parameters and converts them to the new names.*/
		mColor = color;
		width = x;
		height = y;
		startX = locationX;
		startY = locationY;
		/**Creates the building method called createBuilding*/
		createBuilding();
	}

	
	private void createBuilding()
	{
		/**Creates a new Building object with the height and width pulled in from the user input along with the color.*/
		GRect building = new GRect(width,height);
		building.setLocation(startX,startY);
		building.setFillColor(mColor);
		building.setFilled(true);
		add(building);
		
		/**Creates the door in the center of the building no matter the size or height of the building*/
		GRect door = new GRect(DOOR_X,DOOR_Y);
		door.setLocation(startX+((width-DOOR_X)/2),startY+height-(DOOR_Y));
		door.setFillColor(Color.BLACK);
		door.setFilled(true);
		add(door);
		
		/**Casts the double startY over to a new variable name for the window counter called margin*/
 		int margin = (int) startY;
 
 		/**Takes the height of the building and the size of the windows and then counts by +2 to 
 		 * leave a space between each of the windows for the building.*/
 		for (int i = 1; i < (height/WINDOW_SIZE)-3; i+=2) 
 		{
 			
 			/**Takes the times that it goes over by i in the horizontal section
 			 * then takes the window size and the margin and puts it in for the Y
 			 * to count window down.*/
 			int y = i * WINDOW_SIZE + margin;
 			
 			/**creates the row of windows going down and places them each Y over skipping
 			 * one row inbetween.*/
 			for (int j = 1; j < (width/WINDOW_SIZE); j+=2) 
 			{
 				/**creates the window in a set location from the loops that pass it in
 				 * and the set size that is given for the window at the top of the code.*/
 				GRect window = new GRect(10 * j+startX-5, y, WINDOW_SIZE, WINDOW_SIZE);
 				window.setFilled(true);
 				window.setColor(Color.WHITE);
 				add(window);
 			}
 		}
		
	}
}
