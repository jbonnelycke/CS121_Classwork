// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************
public class Circle
{
	public static void main(String[] args)
	{
			final double PI = 3.14159;
			int radius = 10;
			double area1 = PI * radius * radius;
			System.out.println("The area of a circle with radius " + radius + " is " + area1);

			radius = 20;
			double area2 = PI * radius * radius;
			System.out.println("The area of a circle with radius " + radius + " is " + area2);
			
			double factor = area2 / area1;
			System.out.println("The factor by which the area grew is " + factor);
			
			radius = 10;
			double circumference1 = 2 * PI * radius;
			System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
			
			radius = 20;
			double circumference2 = 2 * PI * radius;
			System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);
			
			double factor2 = circumference2/circumference1;
			System.out.println("The factor by which the circumference grew is " + factor2);	
			
	}
}
