import java.util.*;
 class EmployeeTest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		Employee emp1 = new Employee();
		double yearlysal = emp1.yearlySal();
		System.out.println("Yearly Salary of Employee  (before raise):   "+yearlysal);
		emp1.displaySal();
		System.out.println("\nEnter employee details");
		String fName = scan.nextLine();
		String lName = scan.nextLine();
		double mSalary = scan.nextDouble();
		System.out.println("Enter employee address details (enter first line and second line) :");
		String first= scan.nextLine();
		//System.out.println("Enter employee address details (enter second line) :");
		String second= scan.nextLine();
		System.out.println("Enter pin code :");
		long pin=scan.nextLong();
		Employee emp2 = new Employee(fName,lName,mSalary,first,second,pin);
		yearlysal = emp2.yearlySal();
		System.out.println("Yearly Salary of employee (before raise):   "+yearlysal);
		emp2.displaySal();
 		
	}
}
