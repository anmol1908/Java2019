import java.util.*;
class TestVehicle
{
	public static void main(String [] args)
{
	System.out.println( "enter number of tyres");
	Scanner scan=new Scanner (System.in);
	int num =scan.nextInt();
	switch (num)
{
		case 2 :Bike b=new Bike();
			b.display();
			break;
			case 4:Car c=new Car();
			c.display();
			break;
}








}
}

