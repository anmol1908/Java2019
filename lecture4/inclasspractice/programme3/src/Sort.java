import java.util.Scanner;

class Sort
{
 public static void main(String [] args)
 {
   	Scanner scan=new Scanner(System.in);
	int l1,l2,i=0,j=0,k=0,count;
	// asking user to give the size of both arrays
	System.out.println("Enter number of elements in array 1 and 2 respectively :  ");
	l1=scan.nextInt();
	l2=scan.nextInt();
	//array declaration 
	int arr1[]=new int[l1], arr2[]=new int[l2],arr3[]=new int[l1+l2];
	System.out.println("\n Enter elements in array1 :  ");
		for( count=0;count<l1;count++)
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
			arr3[k]=arr1[i];               //if array 1 has smaller element then it is pushed to array 3
			++i;
			}
			else
			{
			arr3[k]=arr2[j];		//if array 2 has smaller element then it is pushed to array 3
			++j;
			}
			++k;
		     }
			   while(k<=i+j)		//loop exists till last index number of array3
			   {
				if(l1>l2)
				{
				arr3[k]=arr1[i];        // if array 1 has some elements left then they are pushed to arry 3
				++i 
				}
				else
				{
				arr3[3]=arr2[j];	// if array 2 has some elements left then they are pushed to arry 3
				++j
				}
			   ++k
 			   }
	System.out.println("\n Merged and sorted array so formed is :   ");
	for( count=0;count<l1+l2;++count)
	{
	System.out.print(+arr3[count]+"\t");
	}
 }
}
