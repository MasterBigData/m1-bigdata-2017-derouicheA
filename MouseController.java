package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import view.MyDisplay;
public class MouseController implements MouseMotionListener {

	protected  MyDisplay myD;
	/*  constructeur complet
	 * 
	 * 
	 */
	public MouseController(MyDisplay x)
	{
		myD= x;
		myD.addMouseMotionListener(this);
	}
	/* methode mousePressed
	 * @param MouseEvent 
	*/
	public void mousePressed(MouseEvent e) 
	{
	}
	public void locationofpress()
	{
	}
	@Override
	public void mouseMoved(MouseEvent e) 
	{
		myD.w.shapes.get(0).getcentre().translate(e.getX(), e.getY());
		myD.repaint(); 
	}
	@Override
	public void mouseDragged(MouseEvent arg0) 
	{
	}

}
