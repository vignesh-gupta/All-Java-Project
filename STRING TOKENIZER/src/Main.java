import java.util.*;

public class Main
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String st,st1;
		StringTokenizer t = new StringTokenizer(s,";");
		while(t.hasMoreTokens())
		{
		st = t.nextToken();
		StringTokenizer t1=new StringTokenizer(st,"=");
		while(t1.hasMoreTokens())
		{
		st1 = t1.nextToken();
		if(t1.hasMoreTokens())
		System.out.print(st1 + " ");
		else
		System.out.print(st1);
		}
		System.out.println("");
		}
		
		sc.close();
	}
}