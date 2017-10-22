package Shapes;
/*joshua santamaria Shapes project*/
public class theRunner {
	public static void main (String[] args)
    {
        Shapes circle1 = new Circle(3);
        Shapes rectangle1 = new Rectangle(10, 4);
        Shapes square1 = new Square(10);

        System.out.println("First test out the hard coded shape arraay.\n\n");
        Shapes [] shapeArr = {circle1, rectangle1, square1};
        
        for (Shapes shape : shapeArr)
        {
        	System.out.println(shape);
        }
        System.out.println("\nDid the three shapes above add up to the total printed here?\n");
        System.out.println("Total Area: " + shapesUtil.sumArea(shapeArr)); //168.26
        System.out.println("Total Perimeter: " + shapesUtil.sumPerimeter(shapeArr)); //86.84
        System.out.println("\nDid the three shapes above add up to the total printed here?\n");


        
        System.out.println("\n\n Now testing the random array.\n");

        shapeArr = new Shapes[10];
        
        //Why are we using a for loop instead of a for-each loop here?
        for (int i = 0; i < shapeArr.length; i++)
        {
            shapeArr[i] = shapesUtil.randomShape();
        }

        for (Shapes shape : shapeArr)
        {
            System.out.println(shape);
        }

        System.out.println("\nTotal Area: " + shapesUtil.sumArea(shapeArr));
        System.out.println("Total Perimeter: " + shapesUtil.sumPerimeter(shapeArr));
}
}
