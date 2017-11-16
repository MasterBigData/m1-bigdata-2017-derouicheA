package model;

public class Point 
{private int x;
private int y;
int nbpt = 0;
	public Point()
	{
		nbpt=nbpt+1;
	}
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
		nbpt=nbpt+1;
	}
	public Point(Point p)
	{
		this .x=p.getx();
		this .y=p.gety();
		nbpt=nbpt+1;
	}
	
	public int getx() 
       {
	return this.x;
		
	}
	public int gety() 
       {
        return this.y;
	}
	
       public String toString() 
       {
        return ("Les coodonnées sont ("+x+","+ y+")");
	}
	boolean isSameas(Point p) {
		return (this.x==p.getx() && this.y==p.gety());
	}
	public void translate(int dx,int dy)
	{
		this.x=this.x+dx;
		this.y=this.y+dy;
	}
	public void translate(int dx)
	{
		this.x=this.x+dx;
	}


}
