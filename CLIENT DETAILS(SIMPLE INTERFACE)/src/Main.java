import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the client id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter the first name");
		String name = br.readLine();
		System.out.println("Enter the middle name");
		String middleName = br.readLine();
		System.out.println("Enter the last name");
		String lastName = br.readLine();
		System.out.println("Enter the phone number");
		String phoneNumber = br.readLine();
		System.out.println("Enter the email id");
		String email = br.readLine();
		System.out.println("Enter the passport number");
		String passport = br.readLine();
		System.out.println("Enter the IATA Country Code");
		String countryCode = br.readLine();
		Client c = new Client(id, name, middleName, lastName,phoneNumber, email, passport, countryCode);
		c.displayClientDetails();
		
	}
}
