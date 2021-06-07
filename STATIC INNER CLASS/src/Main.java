import java.util.*;
import java.text.*;
public class Main {
@SuppressWarnings({ "resource", "unused", "static-access" })
public static void main(String[] args){

     Scanner sc=new Scanner(System.in);
     DecimalFormat df=new DecimalFormat("0.00");
     System.out.println("Enter the shape\n1.Rectangle\n2.Triangle");
     int input=sc.nextInt();
     double value1,value2;
     switch (input)
     {
          case 1:
          System.out.println("Enter the length and breadth:");     
          Shape.Rectangle rectangle=new Shape.Rectangle();
          rectangle.setValue1(sc.nextDouble());
          rectangle.setValue2(sc.nextDouble());
          System.out.println("Area of rectangle is "+df.format(rectangle.computeRectangleArea()));
          break;
          
          case 2:
          System.out.println("Enter the base and height:");
          Shape.Triangle triangle=new Shape.Triangle();
          triangle.setValue1(sc.nextDouble());
          triangle.setValue2(sc.nextDouble()); 
          System.out.println("Area of triangle is "+df.format(triangle.computeTriangleArea()));
          break;
          
          default:
          System.out.println("Invalid choice");
     
     
     }
   }
}   