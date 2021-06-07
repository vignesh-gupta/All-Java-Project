import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the bankname");
		String bankName = sc.next();
		System.out.println("Enter the aadhar id");
		String aadharId = sc.next();
		System.out.println("Enter their IFSC Code");
		String ifscCode = sc.next();
		System.out.println("Enter the amount to deposite");
		Double amount =sc.nextDouble();
		
	}

}
