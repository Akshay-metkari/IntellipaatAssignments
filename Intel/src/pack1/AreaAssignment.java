package pack1;

import java.util.Scanner;

public class AreaAssignment
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		double radius = sc.nextDouble();

		System.out.println("Enter side of square");
		double side = sc.nextDouble();
		
		System.out.println("Enter base and height of traiangle ");
		int base = sc.nextInt();
		int height = sc.nextInt();
		Area a = new Area();
		a.circle(radius);
		a.square(side);
	    a.triangle(base,height);
	    sc.close();
	}
}

class Area
{
	
	void circle(double radius)
	{
		
		double area = 3.142*radius*radius;
		System.out.println("the area of circle is "+area);
	}
	
	void triangle(int base, int height)
	{
		double area = 0.5*base*height;
		System.out.println("The area of trainagle is "+area);
		
	}
	
	void square(double d)
	{
		System.out.println("The area of square is "+d*d);
	}

}
