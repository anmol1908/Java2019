/*  Write a Java program to display the following character rhombus structure.  

Definition of Done:
a) The program asks the user for the number of rows for the rhombus structure from the user.

b) After a successful run, the program should ask the user if he wants to try the program for some other value, and should exit only when the user wants to exit (by pressing the character ‘N’).


 By- Anmol Nagpal
  18csu023
   CS-1A */

import java.util.*;
class Rhombus
{
	public static void main (String[]args)
	{
		char choice;
        do
        {
            //input for no. of rows
            System.out.println("Enter number of rows");
            Scanner scan = new Scanner (System.in);
            int rows = scan.nextInt();          
            char startAt='A';
            int count1=1,count2=1;              
            for (int i = 1; i < (rows * 2); i++)                         
            {
                // to print space
                for (int spc = rows - count2; spc > 0; spc--)   
                    System.out.print(" ");
                if (i < rows) 
                    count2++;
                else 
                    count2--;
                // to print alphabet
                for (int j = 0; j < count1; j++) 
                {
                    System.out.print(startAt);      
                    if (j < count1 / 2) 
                        startAt++;
                    else 
                        startAt--;
                }
                if (i < rows)
                    count1 = count1 + 2;
                else
                    count1 = count1 - 2;
                //resets character toA
                startAt = 'A';      
                //comes to next lint
                System.out.println();      
            }
            System.out.println("Do you want to exit ? Press Y or N");
            choice=scan.next().charAt(0);   
        }
        while (choice=='N');
    }
}
