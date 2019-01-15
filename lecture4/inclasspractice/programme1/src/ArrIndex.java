import java.util.Scanner;
    

class ArrIndex{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int elements[]=new int[10], num,flag=-1,counter;

// to initialise elements in array
System.out.print(" enter elements in array : ");
for( counter=0;counter<10;++counter)
{
elements[counter]=scan.nextInt();
}

// displaying the elements entered

System.out.print(" elements entered in the array are :   \n");
for( counter=0;counter<10;++counter)
{
System.out.print(+elements[counter]+"\t");
}


// Asking user to input element to be searched
System.out.print(" \n enter elements to be searched in array : ");
num=scan.nextInt();

// searching element to be searched
for(counter=0; counter<10;++counter)
{
if(num==elements[counter])
{
flag=1;
break;
}
else
{
flag=-1;
}
}
if(flag==1)
{
System.out.print(" \n Index number is : " + (counter+1));
}
else
{
System.out.print(" -1 ");
}
}
}






