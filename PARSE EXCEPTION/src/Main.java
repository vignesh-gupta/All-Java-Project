import java.text.*; 
import java.util.*;

public class Main {
	static String startd;  static String endd; 
	public static void main(String[] args){
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stage event start date and end date");
		startd= sc.next();
		try 
		{
			Date date = formatter.parse(startd);
			endd=sc.next();
			try
			{
				Date date1 = formatter.parse(endd);  System.out.println("Start date:"+formatter.format(date));  System.out.println("End date:"+formatter.format(date1));
			}
			catch (ParseException e)
			{
				System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'"); 
			}
		}
		catch (Exception a)
		{
			System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'"); 
		}
		sc.close();
	}
}