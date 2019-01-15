

import java.util.Scanner;
    /* 
Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits in the same order and prints the digits separated from one another by three spaces each. (15 minutes) (20 minutes)

Definition of Done:
a) The program should ask the user to input the integer.
b) If the number of digits in the integer is not equal to 5, the program should generate an error message and ask the use to re-enter the integer.
c) After a successful run, the program should ask the user if he wants to try the program for some other value, and should exit only when the user wants to exit (by pressing the character ‘N’). 

  by- Anmol Nagpal
    18csu023
      CS-1A
*/

class Digits{
public static void main(String args[])
{
char choice2;
do
{
Scanner scan=new Scanner(System.in);
//scanning the number from user
System.out.print("enter a 5 digit number");
int choice=scan.nextInt(); 

if(choice>=10000 && choice<=99999)
{
int a,b,c,d,e;            // 5 integers declared to display the 5 digits of the number entered by user
a=choice/10000;
choice=choice%10000;
b=choice/1000;
choice=choice%1000;
c=choice/100;
choice=choice%100;
d=choice/10;
e=choice%10;
System.out.print(" Digits of the number entered are : " +a+"   "+b+"   "+c+"   "+d+"   "+e );
}
else
{
System.out.print("Invalid number entered . please enter a 5 dight number.");
}
System.out.print("Do you want to exit ? press Y or N");
choice2=scan.next().charAt(0);
}
while( choice2=='N' );
}
}




