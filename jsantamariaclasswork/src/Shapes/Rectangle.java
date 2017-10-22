package Shapes;

public class Rectangle implements Shapes{
	private double length;
	private double width;
	public Rectangle(double width, double length){
		this.length = length;
		this.width = width;
	}
	   @Override
	    public double calculateArea() {
		   return ((width * 2) * (length * 2));
	    }

	    @Override
	    public double calculatePerimeter() {
	       return ((width * 2) + (length * 2));
	    }

	    @Override
	    public String toString()
	    {
	        return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	    }
}
