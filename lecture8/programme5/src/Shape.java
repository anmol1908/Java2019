abstract class Shape
{
protected String color;
protected boolean filled;
public Shape()
{
color="Blue";
filled="yes";
}
public Shape(String c,boolean f)
{
this.color=c;
this.filled=f;
}
public void setColor(String c)
{
this.color=c;
}
public String getColor()
{
return color;
}
public void setFilled(boolean f)
{
this.filled=f;
}
public void isFilled()
{
if(filled=="true")
{
System.out.println(" it is filled ");
}
else
{
System.out.println(" it is not filled ");
}
}
abstract double getArea();
abstract double getPerimeter();
abstract String toString();
}

