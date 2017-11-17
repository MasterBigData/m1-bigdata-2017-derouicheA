package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.World;
import model.Shape;

public class MyDisplay extends JPanel implements Observer 
{
    public World w ;
	
	public MyDisplay(World w2) 
	{
		w=w2;
		// TODO Auto-generated constructor stub
	}
	public void update(Observable arg0, Object arg1)
	{
		
	}
		//public class MyDisplay extends JPanel{ 
	public void paintComponent(Graphics e) 
			{
				for (int i =0 ; i<w.shapes.size();i++)
				{
					w.shapes.get(i).ds.draw(e);
				}
						
			}
	
	/* public void repaint() 
     {
	  //repaint le component courant 
       super.repaint(); 
      } */
	
	
	
}