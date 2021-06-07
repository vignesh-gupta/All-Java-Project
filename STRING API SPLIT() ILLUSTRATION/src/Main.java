import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String srr[] = s.split(" ");
		System.out.println("The words in the string are");
		for(String str:srr)
		{
			System.out.println(str);
		}
		sc.close();
	}
}