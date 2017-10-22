package Shapes;

import java.util.Random;

public class shapesUtil {
	public static double sumPerimeter(Shapes[] shapeArr) {
		double tempsum =0;
		for(int i = 0; i < shapeArr.length; i++) {
			tempsum += shapeArr[i].calculatePerimeter();
		}
		return tempsum;
	}
	
	public static double sumArea(Shapes[] shapeArr) {
		double tempsum =0;
		for(int i = 0; i < shapeArr.length; i++) {
			tempsum += shapeArr[i].calculateArea();
		}
		return tempsum;
	}
	
	public static Shapes randomShape() {
		Random r = new Random();
		int x =  r.nextInt(3);
		switch(x) {
		case 0 :
			return new Circle(((double) r.nextInt(100) + 1));
		case 1:
			return new Rectangle(((double) r.nextInt(100) + 1),(double) r.nextInt(100) + 1);
		case 2:
			return new Square(((double) r.nextInt(100) + 1));
		default:
			return new Square(10.0);
		} 
	}
}
