import java.io.*;
import java.util.Scanner;
class Reader
{
public static void main(String args [])
{
Scanner scan=new Scanner(System.in);
try
{
boolean flag=true;
File f=new File("file.txt");
FileReader fin=new FileReader(f);
BufferedReader bin=new BufferedReader(fin);

String sr;
System.out.println(" Enter word you want to search \n");
String word=scan.next();
while((sr=bin.readLine())!=null && flag)
{ 
System.out.println(sr);
String str[] = sr.split(" ");
for(int i=0;i<str.length;++i)
{
if(word.equals(str[i]))
System.out.println("PRESENT\n");
}

flag=false;
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
