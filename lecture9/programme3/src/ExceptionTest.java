class ExceptionTest 
{
public static void main(String args[])
{
string s=null;
try
{
if(s==null)
{
throw new Exception(" NULL ")
}
else
{
System.out.println(s);
}

}
catch(Exception e)
{
System.out.println(e)
}
System.out.println("programme executed successfully ");
}}
