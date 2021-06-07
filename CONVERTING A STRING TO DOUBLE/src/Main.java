import java.util.*;
import java.text.*;

public class Main
{
	public static void main(String[] args)throws ParseException
	{
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the issue date as dd/MM/yyyy");
		Date issued = sf.parse(sc.next());
		System.out.println("Enter the due date as dd/MM/yyyy");
		Date dued = sf.parse(sc.next());
		System.out.println("Enter the original amount");
		Double origAmt = sc.nextDouble();
		System.out.println("Enter amount paid so far");
		Double paidAmt = sc.nextDouble();
		BillHeader bh = new BillHeader();
		bh.setIssueDate(issued);
		bh.setDueDate(dued);
		bh.setOriginalAmount(origAmt);
		DecimalFormat dcf = new DecimalFormat("0.0");
		bh.setAmountOutstanding((origAmt - paidAmt));
		System.out.println("Issue date: "+ sf.format(issued));
		System.out.println("Due Date: "+ sf.format(dued));
		System.out.println("Original amount Rs."+dcf.format(origAmt));
		System.out.println("Amount outstanding Rs."+dcf.format(bh.getAmountOutstanding()));
		
		sc.close();
	}
}