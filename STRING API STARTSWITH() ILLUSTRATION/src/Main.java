import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Enter the start string");
		String ss = sc.next();
		if(s.startsWith(ss))
		{
			System.out.println("\"" + s + "\" starts with \"" +ss + "\"" );
		}
		else
		{
			System.out.println("\"" + s + "\" does not start with \"" +ss + "\"" );
		}
		
		sc.close();
	}
}