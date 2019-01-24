public class BoxWeight extends Box
{
BoxWeight()
{
super();
weight=1;
}
BoxWeight( float l,float w,float d,float wt)
{
super(l,w,d);
weight=wt;
}
void setweight(float wt)
{
weight=wt;
}
void getweight()
{
System.out.println("Weight of box is : "+weight);
}
}
 
