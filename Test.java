package model;

import java.awt.Dimension;

import javax.swing.JFrame;

import view.MyDisplay;

import controller.MouseController;
public class Test {
	public static void main (String [] args) 
	{    
		//Point p2 = new Point(0,0);
	     Point p = new Point(0,0);
	     //ring r1= new ring(p2,100,50);
	     Cercle c= new Cercle(p,45);
	     //Point p1 = new Point(120,5);
	     //ring r2= new ring(p1,100,50);
	     World w = new World();
	     
	     //w.shapes.add(r1);
	     //w.shapes.add(r2);
	     w.shapes.add(c);
	     MyDisplay m = new MyDisplay(w);
	     MouseController msc=new MouseController(m);
	     w.addObserver(m);
	     
	     
	     
	     
		JFrame frame = new JFrame ("java Avancé - Graphic Display ");
		frame.setSize(new Dimension(500,500));
		//frame devient visible
		frame.setVisible(true);
		//pour creer le bouton croix
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
		
		frame.add(m);
	}
}
