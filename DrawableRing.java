package view;
import java.awt.Color;
import java.awt.Graphics;

import model.Shape;
import model.Ring;
	public class DrawableRing extends DrawCercle 
	{  
		
		public DrawableRing(Shape s) 
		{
			super(s);
		}

		public void draw(Graphics e) 
	    {	
	    
	    	super.draw(e);
	    	int aux= ((Ring) s).getR()-((Ring) s).getSmalR();
	    	
	    	e.drawOval(((Ring) s).getcentre().getx()-aux, ((Ring) s).getcentre().gety()-aux,((Ring) s).getSmalR()*4,((Ring) s).getSmalR()*4);
	    }
	    
}
