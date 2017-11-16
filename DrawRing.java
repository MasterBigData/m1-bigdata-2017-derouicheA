package view;

import java.awt.Color;
import java.awt.Graphics;

import model.Shape;
import model.Ring;

public class DrawRing extends DrawCercle
{
	public DrawRing(Shape s) 
	{super(s);
	}

	public void draw(Graphics e) 
    {	
    	e.setColor(Color.BLUE);
    	int aux= ((Ring) s).getR()-((Ring) s).getSmalR();
    	e.drawOval(((Ring) s).getcentre().getx(), ((Ring) s).getcentre().gety(),((Ring) s).getR(), ((Ring) s).getR() );
    	e.setColor(Color.CYAN);
    	e.drawOval(((Ring) s).getcentre().getx()-aux, ((Ring) s).getcentre().gety()-aux,((Ring) s).getSmalR()*4,((Ring) s).getSmalR()*4);
    
    }

}
