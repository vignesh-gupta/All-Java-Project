import java.io.*;
import java.util.*;
 

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> list = new ArrayList<Address>();
		System.out.println("Enter the number of users:");
		int n = sc.nextInt();
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
		sc.nextLine();
		for (int i=0; i<n; i++){
			String input = sc.nextLine();
			String[] spl = input.split(",");
			list.add(new Address(spl[0], spl[1], spl[2], Integer.parseInt(spl[3])));
		}
		Collections.sort(list);
		System.out.println("User Details:");
		for (Address address: list)
		{
			System.out.println(address.getUsername()+","+address.getAddressLine1()+","+address.getAddressLine2()+","+address.getPinCode());
		}
		sc.close();
	}
}