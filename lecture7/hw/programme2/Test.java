import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values of x,y,z");
		float x = scan.nextFloat();
		float y = scan.nextFloat();
		float z = scan.nextFloat();
		Point3D p1 = new Point3D(x,y,z);
		System.out.println(p1.toString());
	}
}
