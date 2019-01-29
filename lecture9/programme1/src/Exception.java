import java.util.*;
class Exception
{
	public static void setTittle(String tittle)
	{
	if(tittle==null)
	{
	throw new IllegalArgumentException(" ");
	}
	System.out.println(tittle);
	}
public static void main(String args[])
{
int choice;
Scanner scan=new Scanner(System.in);
System.out.println("enter choice b/w 1 to 5 ");
choice=scan.nextInt();

switch(choice)
{
case 1: 
try
{
int a=10,b=0;
int ans=a/b;
System.out.println(" Result : "+ans);
}
catch(ArithmeticException e)
{
System.out.println(" Don't divide by 0 ");
}
break;
case 2:
try
{
int a[]=new int[5];
a[11]=9;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
break;
case 3:
try
{
int num=Integer.parseInt("xyz");
System.out.println(num);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
break;
case 4:
try
{
String str=null;
System.out.println(str.length());
}
catch(NullPointerException e)
{
System.out.println(e);
}
break;
case 5:
try
{
String x=null;
setTittle(x);
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}
break;
}
}
}


