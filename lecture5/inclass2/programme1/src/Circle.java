import java.util.*;
class Circle
{
	
	double rad;
	Circle()
	{
		this.rad=1;
	}
	Circle(double r)
	{
		this.rad = r;
	}
        double calcircumference()
	{
		return (2*3.14*rad);
	}
	double calarea()
	{
		return (3.14*rad*rad);
	}
	void display()
	{
                System.out.println("\nCircumference of circle is : "+calcircumference());
		System.out.println("\nArea of circle is : "+calarea());
	}
}

