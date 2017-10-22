package Shapes;

public class Circle implements Shapes {
	private double radius;
	private static double pi = 3.1415926535979;
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double calculateArea() {
		return radius * radius * pi;
	}
	
	public double calculatePerimeter() {
		return 2 * radius * pi;
	}
	
	   public String toString()
	    {
	        return "Circle radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	    }
}
