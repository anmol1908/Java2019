public class Circle
{
private double radius =1.0;
private String color = "red";
 Circle()
{
this.radius=1.0;
this.color="red";
}
 Circle(double radius)
{
this.radius=radius;
this.color="red";  
}
 Circle(double radius,String color)
{
this.radius=radius;
this.color=color;
}
public void setRadius(double radius)
{
this.radius=radius;
}
public void setColor(String color)
{ 
this.color=color;
}
public String getColor()
{
return color;
}
public double getRadius()
{
return radius;
}
public double getArea()
{
return (3.14*radius*radius);
}
}



