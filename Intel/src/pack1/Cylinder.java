package pack1;
import java.util.Scanner;
public class Cylinder 
{
	int h;
	int r;
	double volume;
	public Cylinder()
	{
		h=2;
		r=2;
		System.out.println("in default constructor ");
		double volume = 3.14*h*r;
		System.out.println("the volume is "+volume);
	}
	
	public Cylinder(int height, int radius)
	{
		double volume = 3.14*height*radius;
		System.out.println("In parameterised constructor");
		System.out.println("the volume is "+volume);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		int height = sc.nextInt();

		System.out.println("Enter radius");
		int radius = sc.nextInt();
		Cylinder c1 = new Cylinder();
		Cylinder c2 = new Cylinder(height,radius);
		sc.close();
	
	}
}
