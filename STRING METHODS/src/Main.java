import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the first string : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		String s2 = sc.nextLine();
		
		if(s1.length()>5 && s2.length()>5)
		{
			System.out.println("Substring : "+s1.substring(3));
			System.out.println("The character at 3rd position in the second string is : "+s2.charAt(3));
			System.out.println("Are string 1 and string 2 equal? : "+s1.equalsIgnoreCase(s2));
			System.out.println("Concatenated string : "+s1.concat(s2));
		}
		sc.close();
	}

}
