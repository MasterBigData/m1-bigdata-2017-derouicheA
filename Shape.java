package model;

import view.DrawableShape;

public class Shape 
{
	private Point centre ;
	  public DrawableShape ds ;
	  public Shape ( Point centre) 
	  {
		this.centre = centre  ;
	  }

	  public Point getcentre() 
	  {
	   return centre ;
	  }
	
}
