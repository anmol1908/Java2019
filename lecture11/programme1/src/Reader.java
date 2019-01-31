import java.io.*;
import java.util.Scanner;
class Reader
{
public static void main(String args [])
{
try
{
File f=new File("data.txt");
FileReader fin=new FileReader(f);
BufferedReader bin=new BufferedReader(fin);

String sr;
System.out.println(" The contents of the string are \n");
while((sr=bin.readLine())!=2)
{
String strs[]=sr.split(" ");
System.out.println((strs[0])+" " +(strs[1])+" "+strs[2]+" "+strs[3]);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}

