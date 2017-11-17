package view;
import java.awt.Color;
import java.awt.Graphics;

import model.Shape;
import model.Cercle;
import model.Ring;

public class DrawCercle extends DrawableShape 
{  
	
	public DrawCercle(Shape s) 
	{
		super(s);
	}

	public void draw(Graphics e) 
    {
		
	 e.drawOval(((Cercle) s).getcentre().getx(), ((Cercle) s).getcentre().gety(),((Cercle) s).getR(), ((Cercle) s).getR() );
		
    }
}

