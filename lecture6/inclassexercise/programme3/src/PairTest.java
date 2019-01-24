import java.util.*;
class PairTest
{ 
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of pairs: "); 
		int n = scan.nextInt(); 

		Pairs arr[] = new Pairs [n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter element 1 of pair "+(i+1));
			int obj1 = scan.nextInt();
			System.out.println("Enter element 2 of pair "+(i+1));
			int obj2 = scan.nextInt();
			arr[i] = new Pairs (obj1,obj2);
		}

		Compare obj = new Compare(); 
		obj.compare(arr, n); 
	} 
} 
