


class HeartRate
{
	String firstn;
	String lastn;
	DateOfBirth dob ;
	
	HeartRate(String f,String l,int d,int m,int y)
	{
		firstn=f;
		lastn=l;
		dob=new DateOfBirth(d,m,y);
	}

	double ageCal()
	{
		return (2019-dob.year);
	}
	double maxHeartRate()
	{
		return (220-this.ageCal());
	}
	double targetMaxHeartRate()
	{
		return (0.5*this.maxHeartRate());
	}
	double targetMinHeartRate()
	{
		return (0.85*this.maxHeartRate());
	}
	void doB()
	{
		System.out.println (dob.date+"/"+dob.month+"/"+dob.year);
	}
}
