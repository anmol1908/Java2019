import java.util.*;
class CircleTest
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Circle c1 = new Circle(); 
		double circumference = c1.calcircumference();		
		double area = c1.calarea();
		c1.display();
		System.out.println("\n\n Enter the value of radius:");
		double r=scan.nextInt();
		Circle c2 = new Circle(r);
		circumference = c2.calcircumference();
		area = c2.calarea();
		c2.display();
	}
}
