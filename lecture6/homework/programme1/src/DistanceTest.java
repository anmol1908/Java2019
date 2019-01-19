import java.util.*;
class DistanceTest
{
public static void main(String []args)
{
float f1,f2,i1,i2;
Scanner scan=new Scanner(System.in);
System.out.println("Enter values of f1,i1,f2,i2 respectively :  ");
f1=scan.nextFloat();
i1=scan.nextFloat();
f2=scan.nextFloat();
i2=scan.nextFloat();

Distance d1=new Distance(f1,i1);
Distance d2=new Distance(f2,i2);
System.out.println("The sum between point 1: ("+d1.getValuef()+","+d1.getValuei()+") and point 2: ("+d2.getValuef()+","+d2.getValuei()+") is");
d1.calSum(d2);
}
}


