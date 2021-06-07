import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("1)Privilege Customer\n2)SeniorCitizen Customer");
		System.out.println("Enter Customer Type");
		int type=sc.nextInt();
		
		String name , address , mobileNumber;
		int age;
		Double amount;
		Customer c = new Customer();
		switch (type) {
		case 1:
			PrivilegeCustomer p =new PrivilegeCustomer();
			System.out.println("Enter The Name");
			name = sc.next();
			System.out.println("Enter The Age");
			age = sc.nextInt();
			System.out.println("Enter The Address");
			address = sc.next();
			System.out.println("Enter The Mobile Number");
			mobileNumber = sc.next();
			System.out.println("Enter The Purchased Amount");
			amount = sc.nextDouble();
			
			c.setName(name);
			c.setAge(age);
			c.setAddress(address);
			c.setMobileNumber(mobileNumber);
			
			c.displayCustomer();
			System.out.println("Your bill amount is Rs "+amount+". Your bill amount is discount under privilege customer");
			System.out.println("You have to pay Rs "+df.format(( p.generateBillAmount(amount))));

			break;
		
		case 2:
			SeniorCitizenCustomer s =new SeniorCitizenCustomer();
			System.out.println("Enter The Name");
			name = sc.next();
			System.out.println("Enter The Age");
			age = sc.nextInt();
			System.out.println("Enter The Address");
			address = sc.next();
			System.out.println("Enter The Mobile Number");
			mobileNumber = sc.next();
			System.out.println("Enter The Purchased Amount");
			amount = sc.nextDouble();
			
			c.setName(name);
			c.setAge(age);
			c.setAddress(address);
			c.setMobileNumber(mobileNumber);
			
			c.displayCustomer();
			System.out.println("Your bill amount is Rs "+amount+". Your bill amount is discount under senior citizen customer");
			System.out.println("You have to pay Rs "+df.format(( s.generateBillAmount(amount))));
			break;
			
		default:
			System.out.println("Invalid Customer Type");
			break;
		}
		
		sc.close();
	}
}
