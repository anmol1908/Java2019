import java.util.Scanner;

/* 1. Write a program that reads a 2-D integer array with each element of maximum 2 digits and prints the following:
a) Elements of the entered array. 
b) Elements of the array after each element is multiplied by 2 if it is an odd number. 
Definition of Done:
a) The program should generate an error message if the number of digits in the array is more than two and ask the user to re-enter the number.
b) The program should use continue statement for ignoring even elements.
 By- Anmol Nagpal
    18csu023
      CS-1A
*/ 
    

class Array
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int arr [][]=new int[5][5];
	System.out.println("Enter elements of 2D array having 5 rows and 5 columns \n each entered no. should be a 2 digit no. \n");
		for (int count1=0;count1<5;count1++)
		{
		  for (int count2=0; count2<5;count2++)
		  {
		  arr[count1][count2] = scan.nextInt();
		    if(arr[count1][count2]>=10 && arr[count1][count2]<=99)
		    continue;                                              //if number is a two digit then the loop for entering array continues
		    else 
		    {
		    System.out.println(" Please enter a 2 digit number : ");
		    arr[count1][count2] = scan.nextInt();                    // re-enters array element if its not a two digit number
		    }
		  }
		}
		System.out.print(" \n The final array is:  "  );
		for (int counter=0;counter<5;counter++)
		{
			for (int count=0;count<5;count++)
			{
			  if (arr[counter][count]%2==1)
			  {
			  arr[counter][count]*=2;                     // multiplies by 2 if its a odd number
			  }
			System.out.print(arr[counter][count]+"\t");
			}
		System.out.println("\n");				                 
		}
	}
}























