package HomeworkOne;

public abstract class Shape implements IShape
{
	private float left   = 0.0f;
	private float top    = 0.0f;
	private float right  = 0.0f;
	private float bottom = 0.0f;
	
	//Read only pattern
	public Shape(float nLeft, float nTop, float nRight, float nBottom)
	{
		left   = nLeft;
		top    = nTop;
		right  = nRight;
		bottom = nBottom;
	}
	
	public float getLeft()
	{
		return left;
	}
	
	public float getTop()
	{
		return top;
	}
	
	public float getRight()
	{
		return right;
	}
	
	public float getBottom()
	{
		return bottom;
	}
	
	@Override
	public void move(float x, float y) 
	{
		left   += x;
		top    += y;
		right  += x;
		bottom += y;
	}

	@Override
	public String print() 
	{
		return "Shape(Left,Top,Right,Bottom) --> (" + left + "," + top + "," + right + "," + bottom + ")\r\n";
	}
}
      