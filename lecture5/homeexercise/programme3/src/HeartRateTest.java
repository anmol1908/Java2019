import java.util.*;
class HeartRateTest
{

	public static void main(String[]args)
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First name,Last name and DoB(dd/mm/yyyy) for two people");
		HeartRate person[] = new HeartRate[2];

		for(int count=0;count<2;count++)
		{
			String fName=scan.nextLine();
			String lName=scan.nextLine();
			int date=scan.nextInt();
			int month=scan.nextInt();
			int year=scan.nextInt();			
			HeartRate person[count] = new HeartRate(f,l,d,m,y);
			scan.nextLine();
		}
	System.out.println("\t\tFirst Name\t\tLast Name\t\tDoB\t\tMaximum HeartRate\t\tTarget Min Heart Rate\t\tTarget Max Heart Rate(Max)");
	for(int count=0;count<2;count++)
	{
	System.out.print("Person" + count + "\t\t");
		double age=person[count].ageCal();
		double maxHR = person[count].maxHeartRate();
		double targetmin=person[count].targetMaxHeartRate();
		double targetmax=person[count].targetMinHeartRate();
System.out.print(person[count].firstn+"\t\t"+person[count].lastn+"\t\t"+person[count].DoB()+"\t\t\t"+maxHR+"\t\t"+targetmax+"\t\t\t"+targetmin);
	}	
	}
}
