import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String input =sc.nextLine();
		StringBuffer sbf = new StringBuffer(input);
        System.out.println("Given String : "+input); 
        
        String rev = String.valueOf(sbf.reverse()); 
        System.out.println("String buffer after reversing = " + rev);
        
        if(input.equals(rev))
        	System.out.println("The String is a Palindrome");
        else
        	System.out.println("The String is not a Palindrome");
        sc.close();
	}

}
