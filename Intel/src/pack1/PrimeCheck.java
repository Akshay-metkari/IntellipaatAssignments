package pack1;
import java.util.Scanner;
public class PrimeCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to check prime");
		int n = sc.nextInt();
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println("count is "+count);
		if (count==0)
		{
			System.out.println("no is prime");
		}
		else 
		System.out.println("no is not prime");
		sc.close();
	}
}
