class StaticPt 
{
private float x;
private float y,dist;

StaticPt()
{
this.x=0;
this.y=0;
}
StaticPt ( float x, float y)
{
this.x=x;
this.y=y;
}
void setValuex(float x)

{
this.x=x;
}
void setValuey(float y )
{
this.y=y;
}
float getValuex()
{
return x;
}
float getValuey()
{
return y;
}
static StaticPt calDistance(StaticPt p1,StaticPt p2)
{
StaticPt p=new StaticPt();
p.dist= (float)Math.sqrt(Math.pow((p1.getValuex()-p2.getValuex()),2)+Math.pow((p1.getValuey()-p2.getValuey()),2));
return p;
}
}
