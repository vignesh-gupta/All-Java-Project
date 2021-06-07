import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		System.out.println("Reverse of the string is "+sb.reverse());
		sc.close();
	}
}