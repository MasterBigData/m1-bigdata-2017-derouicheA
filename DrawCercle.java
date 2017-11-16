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

	public void draw(Graphics e )
    {
		
   // e.drawOval(((Cercle) s).getcentre().getx(), ((Cercle) s).getcentre().gety(),((Cercle) s).getR(), ((Cercle) s).getR() );
	e.setColor(Color.BLUE);
    int aux= ((Ring) s).getR()-((Ring) s).getSmalR();
    	e.drawOval(((Ring) s).getcentre().getx(), ((Ring) s).getcentre().gety(),((Ring) s).getR(), ((Ring) s).getR() );
    e.setColor(Color.RED);
    e.drawOval(((Ring) s).getcentre().getx()-aux, ((Ring) s).getcentre().gety()-aux,((Ring) s).getSmalR()*4,((Ring) s).getSmalR()*4);
    
    }
}
