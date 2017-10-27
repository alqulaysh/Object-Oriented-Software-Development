package HomeworkOne;

import java.awt.geom.Point2D;

public class Circle extends Shape
{
	//Read only pattern
	public Circle(float nLeft, float nTop, float nRight, float nBottom)
	{
		super(nLeft, nTop, nRight, nBottom);
	}
	
	@Override
	public String print() 
	{
		final Point2D.Float center = getCenter();
		
		return "Circle(Radius,Center) --> (" + getRadius() + ",(" + center.getX() + "," + center.getY() + "))\r\n";
	}
	
	public float getRadius()
	{
		return ((getLeft() + getRight()) / 2) - getLeft();
	}
	
	public final Point2D.Float getCenter()
	{
		return new Point2D.Float((getLeft() + getRight()) / 2.0f, (getTop() + getBottom()) / 2.0f);
	}
}
      