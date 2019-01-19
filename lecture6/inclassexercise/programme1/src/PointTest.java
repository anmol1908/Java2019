import java.util.*;
class PointTest
{
public static void main(String []args)
{
float x1,x2,y1,y2;
Scanner scan=new Scanner(System.in);
System.out.println("Enter values of x1,x2,y1,y2 respectively :  ");
x1=scan.nextFloat();
x2=scan.nextFloat();
y1=scan.nextFloat();
y2=scan.nextFloat();

Point p1=new Point(x1,y1);
Point p2=new Point(x2,y2);

float dist=p1.calDistance(p2);
System.out.println("The distance between point 1 : ("+p1.getValuex()+","+p2.getValuey()+") and point 2: ("+p2.getValuex() +","+p2.getValuey()+" is: "+dist);
}
} 
