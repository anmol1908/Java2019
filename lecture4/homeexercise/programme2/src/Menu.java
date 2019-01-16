import java.util.Scanner;


public class Menu
{
public static void main(String[]args)
{
int choice;
char choice1;	
do
{
Scanner scan = new Scanner(System.in);
int arr[]= new int[5];
System.out.print(" Enter elements in array :  ");
for (int i=0;i<5;i++)
{
arr[i]=scan.nextInt();
}
System.out.print(" \n\nWhat do you want to do ? Enter choice between 1 to 8\n1.Display the elements\n2.Sum of all the elements\n "); System.out.print(" 3. Largestnumber in array\n4.Smallest number in array\n5.Second Largest number in array ");
System.out.print("\n6.Sum of alternate elements in array\n7.Count even numbers in array\n8.Frequency of a number in array \n\n");
choice=scan.nextInt();
switch (choice)
{
case 1: System.out.print(" elements in array are\n");
        for (int i=0;i<5;i++)
	System.out.print(arr[i]+"\t");
        break;
case 2:int sum=0;
		for (int i=0;i<5;i++)
		{
			sum+=arr[i];
		}
		System.out.print("Sum of elements = "+sum);
break;
case 3:int largest = arr[0];
        for(int i = 0; i <5; i++)
        {
            if(largest < arr[i])
            {
                largest = arr[i];
            }
        }
        System.out.print("Largest number in array is "+largest);
break;
	
case 4:
		int smallest = arr[0];
        for(int i = 0; i <5; i++)
        {
            if(smallest > arr[i])
            {
                smallest = arr[i];
            }
        }
        System.out.print("Smallest element in array is "+smallest);
break;
case 5:int largestt = arr[0], slargest= arr[1];
        for(int i = 0; i <5; i++)
        {
            if(largestt < arr[i])
            {
                slargest=largestt;
                largestt = arr[i];
            }
        }
        System.out.print("Secone largest number in array is "+slargest);
break;
case 6: int s1=0,s2=0;
        s1=arr[0]+arr[2]+arr[4];
        s2=arr[1]+arr[3];
System.out.print("sum of alternate elements from first number is :  " +s1+"  and sum of alternate elements from second number is : " +s2);
break;
case 7:	int count=0;
    	for (int i=0;i<5;i++)
    	{
    		if (arr[i]%2==0)
    			count++;
    	}
    	System.out.print("There are "+count+" even numbers in this array");
break;
case 8: System.out.print("Which element's frequency do you want to calculate");
    	int num=scan.nextInt();
    	int frequency=0;
    	for (int i = 0;i<5;i++)
    	{
    		if (arr[i]==num)
    			frequency++;
    	}
    	System.out.print(num+" occurs "+frequency+" times in this array");
break;
}
System.out.print("\n\nDo you want to exit ? Press 'Y' or 'N'");
			  choice1=scan.next().charAt(0);
		}
		while(choice1=='N');
}
}
