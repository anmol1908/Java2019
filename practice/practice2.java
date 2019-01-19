class Test
{
int a;
Test(int i)
{
a=i;
}

Test incrByTen()
{
Test temp= new Test(a+10);
return temp;
}
}
class RetOb
{
public static void main()
{
Test o1=new Test(2);
Test o2;
o2=o1.incrByTen();
System.out.println(o1.a);

