import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello "+name+"! Welcome to Event Management System.");
		sc.close();
	}

}
