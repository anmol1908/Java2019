class Circle
{
private float rad;
void setRadius(float radius)
{
this.rad=radius;
}
float getRadius()
{
return rad;
}
float findArea()
{
return ((float) 3.14*this.getRadius()*this.getRadius());
}
 void displayArea()
{
System.out.println("Area is : " + this.findArea());
}
}	

