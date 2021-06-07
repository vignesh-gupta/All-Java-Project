import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ItemType obj = new ItemType();
		System.out.println("Enter the item type name");
		String a = sc.nextLine();
		obj.setName(a);
		System.out.println("Enter the cost per day");
		double b = sc.nextDouble();
		obj.setCostPerDay(b);
		System.out.println("Enter the deposit");
		double c = sc.nextDouble();
		obj.setDeposit(c);
		obj.display();
		sc.close();
}

}