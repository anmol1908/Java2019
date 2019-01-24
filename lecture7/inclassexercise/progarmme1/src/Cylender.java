public class Cylender extends Circle
{
private double height=1.0;
 Cylender()
{
super();
this.height=1.0;
}
 Cylender(double radius)
{
super(radius);
this.height=1.0;  
}
public Cylender(double radius,double height)
{
super(radius);
this.height=height;
}
public Cylender(double radius,double height,String color)
{
super(radius,color);
this.height=height;
}
public void setHeight(double height)
{
this.height=height;
}
public Double getHeight()
{
return height;
}
public double getVolume()
{
return(height*getArea());
}
}
