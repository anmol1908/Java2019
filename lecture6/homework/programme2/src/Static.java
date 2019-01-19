class Static
{
 float feet;
 float inch;

Static()
{
this.feet=0;
this.inch=0;
}
Static ( float f, float i)
{
this.feet=f;
this.inch=i;
}
void setValuef(float f)

{
this.feet=f;
}
void setValuei(float i)
{
this.inch=i;
}
float getValuef()
{
return feet;
}
float getValuei()
{
return inch;
}
static Distance calSum(Distance d1, Distance d2)
{
Distance d=new Distance();
d.setValuei((d1.inch+d2.inch));
d.setValuef((d1.feet+d2.feet));
return d;
}
}
