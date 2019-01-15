import java.util.*;
import java.text.DecimalFormat;		//imported to round off the numbers
/*
To compare two floating point numbers upto 3 decimal places
By- Anmol Nagpal
18csu023
CS-1A
*/

class FloatCompare
{
	public static void main (String []args)
	{
		System.out.println("Enter two decimal numbers:");
		Scanner scan = new Scanner(System.in);
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		DecimalFormat num = new DecimalFormat("0.000");	//sets rounding off to 3 places
		String newnum1 =num.format(num1);
		String newnum2 =num.format(num2);

		//comparing the numbers

		int compare = newnum1.compareTo(newnum2);
		if (compare>0)
		{
			System.out.println("Number 1 is greater");
		}
		else if (compare ==0)
			System.out.println("Both are equal");
		else
			System.out.println("Number 2 is greater");
	}
}
