import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1 = sc.nextLine();
		System.out.println("Replaced 'a' with 'z' : "+s1.replace('a', 'z'));
		System.out.println("After trimming : "+s1.trim());
		sc.close();
	}

}
