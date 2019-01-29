class ResizableCircle extends Circle implements Resizable
{
ResizableCircle(double radius)
{
super(radius);
this.radius=radius;
}
public double reSize(int percent)
{
radius=((percent/100)*radius)+radius;
return radius;
}
}

