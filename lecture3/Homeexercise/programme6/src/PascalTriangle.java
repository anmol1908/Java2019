import java.util.Scanner;
/* Write a Java program to display Pascal's triangle.  

Definition of Done:
a) The program asks the user for the number of rows of the pascal’s triangle.
b) The Expected Output for 5 rows should be as follows.

       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1

c) After a successful run, the program should ask the user if he wants to try the program for some other value, and should exit only when the user wants to exit (by pressing the character ‘N’).
By-Anmol Nagpal
18csu023
CS-1A  */


class PascalTriangle
{
    public static void main(String args[])
	{
          char choice;
            do
            {
	    int row, countrow,count, number=1, counter;
		Scanner scan = new Scanner(System.in);
		// entering number of rows
		System.out.print("Enter Number of Rows : ");
		row = scan.nextInt();
		// to display blank spaces
		for(countrow=0;countrow<row;countrow++)
		{
			for(count=row; count>countrow; count--)
			{
				System.out.print(" ");
			}
            number = 1;
                        // to display numbers displayed in Pascal's triangle
			for(counter=0;counter<=countrow;counter++)
			{
				 System.out.print(number+ " ");
                 number = number * (countrow - counter) / (counter + 1);  // changing value of 'number'
			}
			System.out.println();
		}
                System.out.print(" Do you want to exit ? Press Y or N  ");
                choice = scan.next().charAt(0);
            }
            while(choice == 'N');
	}
}
