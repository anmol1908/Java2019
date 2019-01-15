

/*1. Write a program that takes two integers (values to be given within the program) and displays the output of the following operators: addition, subtraction, multiplication, division and modulus. 
 By - Anmol Nagpal 
  18csu023
   Cs-1A*/

class AddSub
{
    public static void main(String args[])
	{
          int num1=25,num2=5,anssub,ansadd,ansdiv,ansmod,ansmul;
            anssub=num1-num2;   
            ansadd=num1+num2;
            ansdiv=num1/num2;
            ansmod=num1%num2;
            ansmul=num1*num2;
               System.out.print("\n answers on applying various operators to two numbers 25 and 5 is \n ");
               System.out.print(anssub + "( on subtracting the two numbers \n)");
               System.out.print(ansadd + "(on adding the two numbers) \n");
               System.out.print(ansdiv + "(on dividing the two numbers) \n");
               System.out.print(ansmod + "(on calculting the modulas of the two numbers) \n");
               System.out.print(ansmul + "(on multiplying the two numbers) \n " );
        }
}

