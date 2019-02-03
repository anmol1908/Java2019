import java.util.*;
class Test
{

	public static void main(String[] args)
	{
		
		Student stu = new Student();
		System.out.println("Enter name of Student:");
		Scanner scan = new Scanner(System.in);
		stu.firstName = scan.nextLine();
		stu.lastName = scan.nextLine();

 		System.out.println("Enter birthday as date,month,year respectively ");
		int date,month,year;
		date = scan.nextInt();
		month = scan.nextInt();
		year = scan.nextInt();
		stu.dob= new Date(date,month,year);

		System.out.println("Enter address \n Line 1-");
		String l1 = scan.nextLine();
		scan.nextLine();
		System.out.println("\nLine2- ");
		String l2 = scan.nextLine();
		System.out.println("\nCity- ");
		String city = scan.nextLine();
		System.out.println("\nState- ");
		String state = scan.nextLine();
		System.out.println("\nPinCode- ");
		int pinCode = scan.nextInt();
		stu.addr=new Address(l1,l2,city,state,pinCode);
  		

		System.out.println("Enter student's email id");
		stu.eMail = scan.nextLine();
                scan.nextLine();
		System.out.println("Enter student's phone number");
		stu.contactNo = scan.nextLine();



		System.out.println("Enter the number of skills in the student ");
		int num = scan.nextInt();
		stu.skills = new String [num];
		
		for (int i=0;i<num;i++)
		{
			System.out.println("Enter skill "+(i+1));
			stu.skills[i]=scan.nextLine();
		}



		System.out.println("How many qualifications does the student have ? enter number");
		int number = scan.nextInt();
		stu.qual = new Qualification [number];
		for (int i=0; i<number;i++)
		{
			System.out.println((i+1)+("st qualification details"));
			System.out.println("Name");
  			scan.nextLine();
			String q = scan.nextLine();
			System.out.println("University");
			String u = scan.nextLine();
			scan.nextLine();
			System.out.println("Institute");
			String ins = scan.nextLine();
			System.out.println("CGPA");
			float cgpa = scan.nextFloat();
			stu.qual[i] = new Qualification(q,u,ins,cgpa);
		}



		System.out.println("How many projects the student has done ? enter number");
		int n = scan.nextInt();
		stu.projects = new Project[n];
		System.out.println("Enter the details for each project: Name, StartDate, EndDate, Role, Responsibilities");
		for (int i=0;i<n;i++)
		{
			System.out.println("Project No. "+(i+1)+".");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Started on-");
			int d1 = scan.nextInt();
			int m1 = scan.nextInt();
			int y1 = scan.nextInt();
			System.out.println("Ended on-");
			int d2 = scan.nextInt();
			int m2 = scan.nextInt();
			int y2 = scan.nextInt();
			System.out.println("Role in project ");
			scan.nextLine();
			String role = scan.nextLine();
			System.out.println("How many responsibilities were there for this project? enter number");
			int a = scan.nextInt();
			stu.projects[i] = new Project();
			stu.projects[i].responsibilities = new String[a];

			for (int count=0;count<a;count++)
			{
				System.out.println("Enter responsibility "+(count+1));
				scan.nextLine();
				stu.projects[i].responsibilities[count] = scan.nextLine();
			}

			stu.projects[i]= new Project(name,role);
			stu.projects[i].startDate = new Date(d1,m1,y1);
			
			stu.projects[i].endDate = new Date(d2,m2,y2);
		}



		


		stu.display();
	}
}
