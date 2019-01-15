import java.util.Scanner;
    /*  Write a Java program that takes a number from the user between 1 and 12 and displays the name of the corresponding month until the user wants to exit the program. (15 minutes)
Definition of Done:
a) The program asks the user to enter a number between 1 and 12.
b) The program should display an error message if the number entered is not between 1 and 12.
c) The corresponding month should be display for the number entered.
d) The program should not exit unless the user wants to exit the program.

  By- Anmol Nagpal
    18csu023
      CS-1A

*/

class Month{
   public static void main(String args[])
   {
   char choice2;
    do
    {
    Scanner scan=new Scanner(System.in);
    //scanning the number from user
    System.out.print("enter number of month : ");
    int choice=scan.nextLong(); 
    System.out.print("\n "); // entering a new line
      // if number is between 1 to 12
      if(choice>=1 && choice<=12)
      {
        switch choice
        {
        case 1 : System.out.print("January");
        break;
        case 2 : System.out.print("February");
        break;
        case 3 : System.out.print("March");
        break;
        case 4 : System.out.print("April");
        break;
        case 5 : System.out.print("May");
        break;
        case 6 : System.out.print("June");
        break;
        case 7 : System.out.print("July");
        break;
        case 8 : System.out.print("August");
        break;
        case 9 : System.out.print("September");
        break;
        case 10 : System.out.print("October");
        break;
        case 11 : System.out.print("November");
        break;
        case 12 : System.out.print("December");
        break;
        }
      }
      else
      {
      System.out.print("Invalid number entered . please enter a number between 1 and 12.");
      }
    System.out.print("Do you want to exit ? press Y or N");
    choice2=scan.next().charAt(0);
    }
    while( choice2=='N' );
   }
}


