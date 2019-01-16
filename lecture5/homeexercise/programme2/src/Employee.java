class Employee
{
	String firstName;
	String lastName;
	double monthlySalary,yearlysal;
        Address add;
  
	Employee()
	{
		firstName="Anmol";
		lastName="Nagpal";
		monthlySalary=500;
                add = new Address("sector 9","gurgaon",1);

           
	}
	Employee(String fName, String lName, double mSalary, String f,String s,long p)
	{
		this.firstName=fName;
		this.lastName=lName;
		this.monthlySalary=mSalary;
                add=new Address(f,s,p);
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
                System.out.print("\nAddress of employee is : " +add.first+" "+add.second+" and pin code is : "+add.pin);
	}
}
