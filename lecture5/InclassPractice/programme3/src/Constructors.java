class Constructor
{
double width,height,depth;
Constructor()
{
width=1;
height=1;
depth=1;
}
Constructor(double w,double d)
{
width=w;
height=1;
depth=d;
}
Constructor(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}

void setDim( float w, float h, float d)
{
width=w;
height=h;
depth=d;
}
double volume()
{
return height*width*depth;
}
}

