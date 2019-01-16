class Date
{
	int month,year,day;
	Date()
	{
		month=1;
		day=1;
		year=2000;
	}
	Date(int d, int m, int y)
	{
		this.month=m;
		this.day=d;
		this.year=y;
	}
	void showDate()
	{
		System.out.println("The Date is : "+this.day+" / "+this.month+" / "+this.year);
	}
}

