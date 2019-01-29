class Circle implements GeometricObject
{
double radius;
Circle( double radius )
{
this.radius=radius;
}
public double getPerimeter()
{
return (2*3.14*radius);
}
public double getArea()
{
return (3.14*radius*radius);
}
}
