import java.util.*;
class Table
{

  	public static void main(String[]args)
  	{
        Scanner scan = new Scanner(System.in);
      	float company[][] = new float [5][4];
        int salesPerson;
     	int product;
     	float value;
 		System.out.println("Enter the salesperson, product, and total sales:");
      	for (int counter=0;counter<4;counter++)
      	{
      		System.out.print("SalesPerson: ");
      		salesPerson = scan.nextInt();
      		System.out.println();
      		System.out.print("Product: ");
      		product = scan.nextInt();
      		System.out.println();
      		System.out.print("Sales: ");
			value = scan.nextFloat();
			System.out.println("\n");
          	company[product - 1][salesPerson - 1] += value;
                }
                for (int i=0; i<5;i++)
     	        {
     		System.out.print("Product "+(i+1)+"\t\t");
     		System.out.print(company[i][0]+"\t\t"+company[i][1]+"\t\t"+company[i][2]+"\t\t"+company[i][3]+"\t\t");
     		System.out.println((company[i][0]+company[i][1]+company[i][2]+company[i][3]));
     	        }
     	System.out.print("\nTotal\t\t\t");
     	for (int j=0;j<4;j++)
     	{
     		System.out.print((company[0][j]+company[1][j]+company[2][j]+company[3][j]+company[4][j])+"\t\t");
     	}
     	System.out.println("\n");

}
}

















































