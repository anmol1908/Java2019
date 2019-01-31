class Test
{
public static void main(String args[])
{
try
{
MyTime t=new MyTime(23,59,59);
MyTime t1=t.nextHour();
System.out.println("Time in next hour is : " +t1.toString());
MyTime t2=t.nextMin();
System.out.println("Time in next min is : " +t2.toString());
MyTime t3=t.nextSec();
System.out.println("Time in next sec is : " +t3.toString());

MyTime tt=new MyTime(23,0,0);
MyTime t4=tt.previousHour();
System.out.println("Time in previous hour is : " +t4.toString());
MyTime t5=tt.previousMin();
System.out.println("Time in previous min is : " +t5.toString());
MyTime t6=tt.previousSec();
System.out.println("Time in previous sec is : " +t6.toString());
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}
}
}
