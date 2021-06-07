import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Enter the end string");
		String ss = sc.next();
		if(s.endsWith(ss))
		{
			System.out.println("\"" + s + "\" ends with \"" +ss + "\"" );
		}
		else
		{
			System.out.println("\"" + s + "\" does not end with \"" +ss + "\"" );
		}
		
		sc.close();
	}
}