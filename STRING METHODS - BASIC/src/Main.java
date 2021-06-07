import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1=sc.nextLine();
		System.out.println("Enter the second string : ");
		String s2=sc.nextLine();
		
		System.out.println("Upper Case : "+s1.toUpperCase());
		
		System.out.println("Lower Case : "+s2.toLowerCase());
		
		sc.close();
	}
}
