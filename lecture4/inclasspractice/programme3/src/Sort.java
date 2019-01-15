import java.util.Scanner;

class Sort
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);
int l1,l2,i=0,j=0,k=0,count;
// asking user to give the size of both arrays
/*System.out.println("Enter number of elements in array 1 and 2 respectively :  ");
l1=scan.nextInt();
l2=scan.nextInt();*/
int arr1[]=new int[4], arr2[]=new int[5],arr3[]=new int[9];
System.out.println("\n Enter elements in array1 :  ");
for( count=0;count<arr2.length;count++)
{
arr1[count]=scan.nextInt();
}
for( count=0;count<l2;count++)
{
arr2[count]=scan.nextInt();
}
while(i<arr1.length && j<arr2.length)
{
if(arr1[i]<arr2[j])
{
arr3[k]=arr1[i];
++i;
}
else
{
arr3[k]=arr2[j];
++j;
}
++k;
}
while(k<=i+j)
{
if(l1>l2)
{
arr3[k]=arr1[i];
}
else
{
arr3[3]=arr2[j];
}
}
System.out.println("\n Merged and sorted array so formed is :   ");
for( count=0;count<l1+l2;++count)
{
System.out.print(+arr3[count]+"\t");
}
}
}
