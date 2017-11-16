package model;

import java.awt.Dimension;

import javax.swing.JFrame;

import view.MyDisplay;


public class Test {

	public static void main (String [] args) 
	{    
	     Point p2 = new Point(100,300);
	    
	     Ring r1= new Ring(p2,100,50);
	     
	     World w = new World();
	     
	     w.shapes.add(r1);
	     MyDisplay m = new MyDisplay(w);
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
