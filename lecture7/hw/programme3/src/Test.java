import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		Shape s1 = new Shape();
		
		System.out.println("Enter length and breadth of Rectangle");
		float len,wid;
		len = scan.nextFloat();
		wid = scan.nextFloat();
		Rectangle r = new Rectangle(len,wid);
		
		System.out.println("Enter square side ");
		float side;
		side = scan.nextFloat();		
		Square s=  new Square(side);

		System.out.println("Enter radius of Circle");
		float rad;
		rad = scan.nextFloat();		
		Circle c=  new Circle(rad);

		System.out.println("Shape: \t"+s1.toString());
		System.out.println("Rectangle: \t"+r.toString());
		System.out.println("Circle: \t"+c.toString());
		System.out.println("Square: \t"+s.toString());
	}
}
