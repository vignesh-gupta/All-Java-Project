import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the length of the rectangle");
        int l = sc.nextInt();
        System.out.println("Enter  the width of the rectangle");
        int w = sc.nextInt();
        
        Rectangle r = new Rectangle( l , w );
        int area = r.area();
        r.display();
        System.out.println("Area of the Rectangle:"+area);
        
        System.out.println("Enter  the new dimension");
        int newdim = sc.nextInt();
        Rectangle r1 = r.dimensionChange(newdim);
        if(r1 instanceof Rectangle){
        	area = r1.area();
            r1.display();
            System.out.println("Area of the Rectangle:"+area);;
        }
        sc.close();
	}

}
