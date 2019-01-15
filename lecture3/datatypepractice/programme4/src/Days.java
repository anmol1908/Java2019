/* Program to convert min into number of years, months and days */

import java.util.Scanner;


class Days
{
    public static void main(String args[])
    {
    int years,months,day;
    Scanner scan=new Scanner(System.in);
    // to input no. of minutes from user
    System.out.print("Enter number of minutes: ");
    int minutes = scan.nextInt();
    //calculating number of years
    years=minutes/525600;     
    //calculating minutes left after calculating number of days. Eg- 525680 min means 1 year and 80 minutes left                        
    minutes=minutes-(years*525600);  
    //calculating number of months                 
    months=minutes/43200;
    //calculating minutes left after calculating number of days. Eg- 525680 min means 1 year and 80 minutes left 
    minutes=minutes-(months*43200);
    //calculating number of days
    day=minutes/1440;
    System.out.print("\n number of years = " +years+"    number of months = " +months+"   number of days = " +day);
    }
}
