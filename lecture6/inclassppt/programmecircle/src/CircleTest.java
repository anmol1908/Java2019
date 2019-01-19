import java.util.*;
class CircleTest
{
public static void main(String []args)
{
float r;
Circle c= new Circle();
c.setRadius(2);
r=c.getRadius();
System.out.println("Radius of circle is "+r);
System.out.println("Area of circle is ");
c.displayArea();
}
}

