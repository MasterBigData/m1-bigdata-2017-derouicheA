package model;

import view.DrawableRing;

public class Ring extends Cercle{
	
	private int SmalR;

	public Ring(Point p, int br,int sr) {
		super( p,  br);
		if (sr>br)
		{
			System.out.println("Le rayon doit etre infrieur à "+br+ " !! petit rayon  initialiser a zero");
		}
		else 
			SmalR=sr;
		
		ds=new DrawableRing(this);
	}

	public int getSmalR() {
		return SmalR;
	}

	public void setSmalR(int smalR) {
		SmalR = smalR;
	}

	public boolean equals(Ring r) {
		if (this.SmalR==r.getSmalR() && this.getCenter().isSameas(r.getCenter()))
			return true;
		else 
			return false;
	}
	public String toString(){

		  return ( "\n Anneau et de centre  "+super.toString() + "et de petit rayon =  "+SmalR);

	}
}
