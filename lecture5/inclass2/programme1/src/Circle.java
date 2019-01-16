mport java.util.*;
class Circle
{
	
	double radius;
	Circle()
	{
		this.radius=1;
	}
	Circle(double r)
	{
		this.radius = r;
	}
	double area()
	{
		return (3.14*radius*radius);
	}
	double circumference()
	{
		return (2*3.14*radius);
	}
	void display(double area, double circum)
	{
		System.out.println("Area is: "+area);
		System.out.println("Circumference is: "+circum);
	}
}

