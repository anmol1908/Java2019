import java.io.*;
import java.util.Scanner;
class Write
{
public static void main(String args[])
{
try
{
File f=new File("file.txt");
FileWriter fout=new FileWriter(f);
BufferedWriter bout=new BufferedWriter(fout);

Scanner sc=new Scanner(System.in);
boolean flag=true;
while(flag)
{
System.out.println("enter string");
bout.write(sc.nextLine());
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
