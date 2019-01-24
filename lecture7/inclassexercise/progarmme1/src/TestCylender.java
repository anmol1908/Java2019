public class TestCylender
{
public static void main(String args[])
{
Cylender c1=new Cylender();
System.out.println(c1.getRadius());
System.out.println(c1.getColor());
System.out.println(c1.getArea());
System.out.println(c1.getVolume());
Cylender c2=new Cylender(2,7,"Black");
System.out.println(c1.getRadius());
System.out.println(c1.getColor());
System.out.println(c1.getArea());
System.out.println(c1.getVolume());
}
}
