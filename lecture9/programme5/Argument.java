class Argument
{
public static void main(String args[])
{
try
{
int a,count=0,sum=0;
	for (int i=0;i<args.length;i++)
	{
	a=Integer.parseInt(args[i]);
	count=count+1;
	sum=sum+a;
	}
		if(count<4)
		{
		throw new CheckArgumentException(" argument is less than 5 ");
		}
		else
		{
		System.out.println(sum);
		}
}
catch(CheckArgumentException e)
{
System.out.println(" caught the exception ");
}
	finally
	{
	System.out.println(" code executed ");
	}
}
}


