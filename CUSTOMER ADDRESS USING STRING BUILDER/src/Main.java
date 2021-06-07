import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Address Details :");
		System.out.println("Enter Line 1 :");
		String l1 = sc.nextLine();
		System.out.println("Enter Line 2 :");
		String l2 = sc.nextLine();
		System.out.println("Enter City :");
		String c=sc.nextLine();
		System.out.println("Enter Country :");
		String country = sc.nextLine();
		System.out.println("Enter Zip Code :");
		int zip = sc.nextInt();
		Address ad = new Address();
		ad.setLine1(l1);
		ad.setLine2(l2);
		ad.setCity(c);
		ad.setZipCode(zip);
		ad.setCountry(country);
		System.out.println(ad.toString());
		
		sc.close();
	}


}