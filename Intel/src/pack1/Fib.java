package pack1;
import java.util.Scanner;
public class Fib {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=0;
		int y=1;
		int z;
		System.out.println(x);
		for(int i=2;i<=n;i++)
		{
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
		sc.close();
	}

	
	
}
