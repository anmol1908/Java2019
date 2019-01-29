class Square extends Rectangle
{
protected double side;
public Square()
{
this.side=1;
}
public Squrae(double s)
{
this.side=s;
}
public Square(doublr s,String c,boolean f)
{
super(c,f)
this.side=s;
}
void setSide(double s)
{
this.side=s;
}
double getSide()
{
return side;
}
void setLength(double s)
{
this.length=s;
}
void setWidth(double s)
{
this.length=s;
}
String toString()
{
return (" The area and perimeter of square is "+getArea()+" "+getPerimeter()+"and color and filled status is "+getColor() +" "+ isFilled())
}
}
