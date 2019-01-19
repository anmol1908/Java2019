import java.util.Scanner;
public class EmployeeTest
{

        public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int num=scan.nextInt();
		Employee emp[]=new Employee[num];
		for (int counter=0;counter<num;counter++)
		{
		System.out.println(" Enter name , address and year of joining of employee " + (counter+1)+ " : ");
		String name=scan.nextLine();
		scan.nextLine();
		String address=scan.nextLine();
		
		int year=scan.nextInt();
		emp[counter]= new Employee(name,address,year);
		}
		System.out.println(" Details of employees are :->");
		System.out.println(" Name \t\t Address \t\t\t\t year of joining  " );
		for (int counter=0;counter<num;counter++)
		{
		emp[counter].display();
		}
	}
}
