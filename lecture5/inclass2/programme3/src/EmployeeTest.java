import java.util.*;
 class EmployeeTest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		Employee emp1 = new Employee();
		double yearlysal = emp1.yearlySal();
		System.out.println("Yearly Salary of Employee :   "+yearlysal);
		emp1.displaySal();
		System.out.println("Enter employee details");
		String fName = scan.nextLine();
		String lName = scan.nextLine();
		double mSalary = scan.nextDouble();
		Employee emp2 = new Employee(fName,lName,mSalary);
		yearlysal = emp2.yearlySal();
		System.out.println("Yearly Salary of employee :   "+yearlysal);
		emp2.displaySal();
	}
}
