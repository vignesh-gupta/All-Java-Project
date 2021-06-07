import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the country name");
	     String name = sc.nextLine();
	     System.out.println("Enter the country code");
	     String countryCode = sc.nextLine();
	     System.out.println("Enter the isd code");
	     String isdCode = sc.nextLine();
	     
	     Country con = new Country(name, countryCode, isdCode);
	     con.display();	
	     sc.close();

	}

}
