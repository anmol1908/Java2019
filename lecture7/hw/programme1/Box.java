public class Box
{
float weight;
float length,width,depth;
Box()
{
length=1;
width=1;
depth=1;
}
Box(float l, float w,float d)
{
length=l;
width=w;
depth=d;
}
void setDimensions(float l, float w,float d)
{
length=l;
width=w;
depth=d;
}
void getDimensions()
{
System.out.println("The dimensions are : " +length+" "+width+" "+depth);
}
void displayVol()
{
System.out.println(" Volume of box is : " +(length*depth*width));
}
}
