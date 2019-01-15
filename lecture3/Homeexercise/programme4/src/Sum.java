import java.util.*;
/*
Compute the sum of the series:
      1+x+x2 /2!+x3/3!+……

Definition of Done:
a) The program should ask the user to enter the value of x.
b) The program should ask the user to enter the number of terms for which the sum is to be calculated.
By-Anmol Nagpal
 18csu023
 Cs-1A
*/


class Sum
{
	public static void main (String[]args)
	{
                // To Enter Value of x
		System.out.println(" Enter the value of x \n");
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();	 
	        System.out.println(" Enter the power of x till which sum is to be calculated \n");
                int limit= scan.nextInt();
                int counter1,counter2,power=0;
                int sum=0,factorial=1,num;
                // to access all values till limit
                for(counter1=0;counter1<=limit;++counter1)
                {
                num= (int) Math.pow(x,power);
                 for(counter2=1;counter2<=power;++counter2)
                 {
                 factorial*=counter2; // calculating factorial
                 }
                sum+=num/factorial;   // logic applied eg- to calculate x^2/(2!)
                power+=1;
                }
                System.out.print(" Sum of sereis is: " +sum+"\n");
        }
}





                
