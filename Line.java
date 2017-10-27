package HomeworkOne;

public class Line extends Shape
{
	//Read only pattern
	public Line(float nLeft, float nTop, float nRight, float nBottom)
	{
		super(nLeft, nTop, nRight, nBottom);
	}
	
	@Override
	public String print() 
	{
		return "Line(Left,Top,Right,Top) --> (" + getLeft() + "," + getTop() + "," + getRight() + "," + getTop() + ")\r\n";
	}
}
    
      