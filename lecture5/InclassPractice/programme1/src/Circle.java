import java.util.*;
class Circle
{
    int c1;
    double radius;
    void enterRad()
    {
    Scanner scan=new Scanner(System.in);
    System.out.print(" \n enter Radius of circle : ");
    c1=scan.nextInt();
    }
    double findArea()
    {
    return c1*c1*3.14;
    }
    void displayArea()
    {
    System.out.print("Area of circle is :  " + findArea());
    }
}


