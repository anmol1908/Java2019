class Shape
{
	private String color;
	private boolean filled;

	Shape()
	{
		color="Red";
		filled=true;
	}

	Shape(String c, boolean f)
	{
		color=c;
		filled=f;
	}
	void setColor(String c)
	{
		color=c;
	}

	String getColor()
	{
		return color;
	}
	void setFilled(boolean f)
	{
		filled=f;
	}

	boolean isFilled()
	{
		return filled;
	}
	public String toString()
	{
		return (getColor()+"\t"+isFilled());
	}
}

