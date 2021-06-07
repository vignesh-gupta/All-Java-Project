import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number");
		String bin = new String(sc.next());
		System.out.println("Enter the octal number");
		String oct = new String(sc.next());
		System.out.println("Enter the hexadecimal number");
		String hex = new String(sc.next());
		
		
		System.out.println("The integer value of the binary number "+bin+" is "+Integer.parseInt(bin, 2));
		System.out.println("The integer value of the octal number "+oct+" is "+Integer.parseInt(oct, 8));
		System.out.println("The integer value of the hexadecimal number "+hex+" is "+Integer.parseInt(hex, 16));
		sc.close();
	}
}