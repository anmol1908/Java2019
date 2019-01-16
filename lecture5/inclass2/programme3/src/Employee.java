class Employee
{
	String firstName;
	String lastName;
	double monthlySalary,yearlysal;
  
	Employee()
	{
		firstName="Anmol";
		lastName="Nagpal";
		monthlySalary=500;
	}
	Employee(String fName, String lName, double mSalary)
	{
		firstName=fName;
		lastName=lName;
		monthlySalary=mSalary;
	}
	double yearlySal()
	{
                yearlysal= 12*this.monthlySalary;
		return (yearlysal);
	}
	double salRaise()
	{
		return (0.1*this.yearlysal+this.yearlysal);
	}
	void displaySal()
	{
		System.out.println("Employee details:\n"+firstName+" "+lastName+"\nYearly Salary of employee after raise is :"+salRaise());
	}
}
