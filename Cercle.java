package model;

import view.DrawCercle;

public class Cercle  extends Shape
{
	private Point ctr;
	private int r;
	
	public Cercle(Point C, int rayon)
	{super(C) ;
		r=rayon;
		ds=new DrawCercle(this) ;
	}
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	public void translatecercle(int x,int y) {
		ctr.translate(x, y);
	}

	

	public String toString() {
		return "[ Cercle de centre " + ctr.toString() + "et de rayon r= " + r + " et de surface =  "+this.surface()+"]";
	}
	//public void translate(int dx,int dy) {
		//ctr.translate(dx,dy);}

	public Point getCenter() {
		return ctr;
	}
	public double surface () {
		return (3.14*r*r);
	}
	//public boolean conatins(Point p) {
		//return ( r==Math.sqrt(Math.pow(ctr.getx()-p.getx(),2)+Math.pow(ctr.gety()-p.gety(),2)));}

	public boolean conatins(Point p,Cercle... c) {
		for (Cercle ct  : c)	{
			if (ct.conatins(p))
			return true;
		}
		return false;
	}

}
