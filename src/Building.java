/**
 * Animated_Bubbles.java
 * @author Garrett J. Beasley
 * 10/06/2014
 * Draws a Bubbles that grow and move to the top of the screen
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
	
	public Building(Color color, double x,double y)
	{
		mColor = color;
		width = x;
		height = y;
		createBuilding();
		createGround();
	}

	
	private void createBuilding()
	{
		int startX = 50; int StartY=500;
		GRect building = new GRect(width,height);
		building.setLocation(startX,StartY);
		building.setFillColor(mColor);
		building.setFilled(true);
		add(building);
		
		int doorX = 15; int doorY = 20;
		GRect door = new GRect(doorX,doorY);
		door.setLocation(startX+((width-doorX)/2),StartY+height-(doorY));
		door.setFillColor(Color.BLACK);
		door.setFilled(true);
		add(door);
		
		int windowSep =0;
		for(int i=1; i<8; i++)
		{
			GRect window = new GRect(10,10);
			window.setLocation(startX+windowSep,StartY+5);
			window.setFillColor(Color.RED);
			window.setFilled(true);
			add(window);
			
			windowSep+=15;
		}
		
	}
	
	
	private void createGround()
	{
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
}
