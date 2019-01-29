package edu.ncu.main;
import edu.ncu.exception.*;
import edu.ncu.processor.*;
public class Driver
{
public static void main()
{
A obj=new C();
try
{
obj.E();
}
catch(ExceptionA e1)
{
System.out.println(e1);
}
catch(ExceptionB e2)
{
System.out.println(e2);
}
catch(ExceptionC e3)
{
System.out.println(e3);
}
}
}
