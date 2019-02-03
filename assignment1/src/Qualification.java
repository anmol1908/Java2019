class Qualification
{
String qualName;
String university;
String institute;
float cgpa;
	Qualification()
	{
		this.qualName = null;
		this.university = null;
		this.institute = null;
		this.cgpa = 0;
	}
	Qualification(String q, String u, String i, float c)
	{
		this.qualName = q;
		this.university = u;
		this.institute = i;
		this.cgpa = c;
	}
}
