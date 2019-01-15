import java.util.Scanner;
    /* Write a Java program to solve quadratic equations (use if, else if and else) (10 minutes)

                          Definition of Done:
                          a) The program asks the values of coefficients of a quadratic equation.
                          b) The program should display the roots or an appropriate message
   By -Anmol Nagpal
    18csu023
      CS-1A */

class Roots{
     public static void main(String args[])
     {
     Scanner scan=new Scanner(System.in);
     //scanning coefficient of x^2
     System.out.print("enter value of a: " +"\n");
     int a=scan.nextInt(); 
     //scanning coefficient of x    
     System.out.print("enter value of b: " +"\n");
     int b=scan.nextInt();
     //scanning coefficient of x^0
     System.out.print("enter value of c: " +"\n" );
     int c=scan.nextInt();
     int D=(b*b)-(4*a*c);
       //Roots of equation when D is positive
       if(D>0.0)
       {
       float result= (float) Math.pow(D,0.5);
       int root1= (int) (-b+result)/(2*a);
       int root2= (int)(-b-result)/(2*a);
       System.out.print(" The roots of the equation are " +root1 +"and" +root2);
       }
       // both roots of equation are same when D is equal to zero
       else if(D==0)
       {
       int root=  -b/(2*a);
       System.out.print("the root of equation is: " +root );
       }
       //Roots of equation when D is negative
       else
       {
       System.out.print(" real solutions does'nt exist for this equation ");
       }
     }
}

