class Circle extends Shape
{
protected double radius;
public Cirle()
{
this.radius=1;
}
public Circle(double r)
{
this.radius=r;
}
public Circle(doublr r,String c,boolean f)
{
super(c,f)
this.radius=r;
}
void setRadius(double r)
{
this.radius=r;
}
double getRadius()
{
return radius;
}
double getArea()
{
return (3.14*radius*radius);
}
double getPerimeter()
{
return (2*3.14*radius);
}
String toString()
{
return (" The area and perimeter of circle is "+getArea()+" "+getPerimeter()+"and color and filled status is "+getColor() +" "+ isFilled())
}
}
