import java.io.*;
import java.util.Scanner;
class FileDemo
{
public static void main(String args[])
{
try
{
File f=new File("data.txt");
FileWriter fout=new FileWriter(f);
BufferedWriter bout=new BufferedWriter(fout);

Scanner sc=new Scanner(System.in);
boolean flag=true;
while(flag)
{
System.out.println("enter serial number ");
bout.write(Integer.toString(sc.nextInt()));
bout.write(' ');
System.out.println("enter name ");
bout.write(sc.next());
bout.write(' ');
System.out.println("enter CGPA ");
bout.write(Float.toString(sc.nextFloat()));
bout.write(' ');
System.out.println("enter Grade ");
bout.write(sc.next().charAt(0));
bout.write(' ');
System.out.println("do u want to continue (Y/N)");
char c=sc.next().charAt(0);
if(c=='N')
flag=false;
}
bout.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
