class Rectangle extends Shape
{
protected double width;
protected double length;
public Rectangle()
{
this.length=1;
this.width=1;
}
public Circle(double w,double l)
{
this.width=w;
this.length=l;
}
public Circle(doublr w,double l,String c,boolean f)
{
super(c,f)
this.width=w;
this.length=l;
}
void setWidth(double w)
{
this.width=w;
}
double getWidth()
{
return width;
}
void setLength(double l)
{
this.length=l;
}
double getLength()
{
return length;
}
double getArea()
{
return (length*width);
}
double getPerimeter()
{
return (2*(length+breadth));
}
String toString()
{
return (" The area and perimeter of rectangle is "+getArea()+" "+getPerimeter() +"and color and filled status is "+getColor() +" "+ isFilled())
}
}
