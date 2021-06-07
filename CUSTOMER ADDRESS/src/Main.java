import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Customer Address");
	     System.out.println("Enter the street");
	     String street = sc.nextLine();
	     System.out.println("Enter the city");
	     String city = sc.nextLine();
	     System.out.println("Enter the pincode");
	     int pincode = sc.nextInt();
	     System.out.println("Enter the country");
	     String country=sc.next();
	     
	     Address a = new Address(street, city, pincode, country);
	     a.displayAddress();	
	     
	     
	     sc.close();

	}

}
