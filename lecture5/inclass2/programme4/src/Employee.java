class Employee
{
	String name,address;
	int year;
	static int i=1;
	Employee()
	{
		name="anmol";
		address="nagpal";
		year=2018;
	}
	Employee(String n, String a, int y)
	{        
	this.name=n;
	this.address=a;
	this.year=y;
	}
	void display()
	{
		System.out.println(i +this.name+"\t\t"+this.address+"\t\t\t\t"+this.year);
	++i;
	}
}
