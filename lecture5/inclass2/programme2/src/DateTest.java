class DateTest
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		Date obj1 = new Date();
		obj1.showDate();
		Date obj2=new Date();
		System.out.println("Enter the Day, Month and Year respectively :  \n");
		int d = scan.nextInt();
		int m = scan.nextInt();
		int y = scan.nextInt();
		obj2 = new Date(d,m,y);
		obj2.showDate();
	}
}
