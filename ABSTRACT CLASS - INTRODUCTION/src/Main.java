import java.util.Scanner; 

public class Main {
    public static void main(String args[]) throws Exception {
		
             Scanner scanner = new Scanner(System.in);

        System.out.println("List of Shapes:");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.println("Enter your choice:");
        int shapeType = Integer.parseInt(scanner.nextLine());

        switch (shapeType) {
            case 1:
                System.out.println("Enter the radius of the Circle:");

                float radius = Float.parseFloat(scanner.nextLine());

                Shape circle = new Circle(radius);

                System.out.printf("The perimeter is %.2f%n",circle.calculatePerimeter());
                break;
            case 2:

                System.out.println("Enter the length of the Rectangle:");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the Rectangle:");
                float breadth = Float.parseFloat(scanner.nextLine());
                Shape rectangle = new Rectangle(length,breadth);
                System.out.printf("The perimeter is %.2f%n",rectangle.calculatePerimeter());
                break;
            case 3:
                System.out.println("Enter the side of the Square:");
                float side = Float.parseFloat(scanner.nextLine());
                Shape square = new Square(side);
                System.out.printf("The perimeter is %.2f%n",square.calculatePerimeter());
                break;
            default:
                break;
        }
        
        scanner.close();
	}
}
