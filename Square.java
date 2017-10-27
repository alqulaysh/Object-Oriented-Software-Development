package HomeworkOne;

public class Square extends Shape
{
	//Read only pattern
	public Square(float nLeft, float nTop, float nRight, float nBottom)
	{
		super(nLeft, nTop, nRight, nBottom);
	}
	
	@Override
	public String print() 
	{
		return "Square(Left,Top,Right,Bottom) --> (" + getLeft() + "," + getTop() + "," + getRight() + "," + getBottom() + ")\r\n";
	}
}
    