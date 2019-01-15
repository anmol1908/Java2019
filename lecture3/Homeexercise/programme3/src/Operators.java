import java.util.*;
/*
To observe the effect of using relational and logical operators on integers and boolean values
By-Anmol Nagpal
 18csu023
 Cs-1A
*/


class Operators
{
	public static void main (String[]args)
	{
                // Inputs two numbers
		System.out.println(" Enter two integers \n");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();	 
		int num2 = scan.nextInt(); 
		System.out.print ("Equal to operation: "+ (num1==num2));
		System.out.print ("\nNot Equal to operation: "+ (num1!=num2));
		System.out.print ("\nGreater than operation: "+ (num1>num2));
		System.out.print ("\nSmaller than operation: "+ (num1<num2));
		System.out.print ("\nGreater than or Equal to operation: "+ (num1>=num2));
		System.out.print ("\nSmaller than or Equal to operation: "+ (num1<=num2));
		System.out.print ("\nOR operation: "+ ((num1>num2)||(num1==num2)));
		System.out.print ("\nAND operation: "+ ((num2!=num1)&&(num1<=num2)));

		System.out.println("\n Enter two Boolean values (use T or F)  ");
		char boo1 = scan.next().charAt(0);
		boolean bool1;
		boolean bool2;
		if (boo1=='T')
			bool1=true; //converts character to boolean
		else
			bool1=false; //converts character to boolean
		char boo2 = scan.next().charAt(0);
		if (boo2=='T')
			bool2=true;
		else
			bool2=false;
		System.out.println ("\n Equal to operation: "+ (bool1==bool2));
		System.out.println ("\nNot Equal to operation: "+ (bool1!=bool2));
		System.out.println ("\nConditional OR operation: "+ (bool2||bool1));
		System.out.println ("\nConditional AND operation: "+ (bool2&&bool1));

	}
} 
