import java.util.Scanner;
import java.text.*;
public class Main {


	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the ticket type");
		System.out.println("1.Platinum\n2.Gold\n3.Silver");
		Scanner sc = new Scanner(System.in);
		int type=sc.nextInt();
		DecimalFormat df = new DecimalFormat("0.00"); 
		switch(type){
		case 1:
			Ticket.Platinum pal = new Ticket.Platinum();
			System.out.println("Enter the no. of seats");
			pal.setNoOfSeats(sc.nextInt());
			System.out.print("Cost of the tickets is Rs."+df.format(pal.computeCost()));
			break;
		case 2:
			Ticket.Gold gold = new Ticket.Gold();
			System.out.println("Enter the no. of seats");
			gold.setNoOfSeats(sc.nextInt());
			System.out.print("Cost of the tickets is Rs."+df.format(gold.computeCost()));
			break;
		case 3:
			Ticket.Silver silver = new Ticket.Silver();
			System.out.println("Enter the no. of seats");
			silver.setNoOfSeats(sc.nextInt());
			System.out.print("Cost of the tickets is Rs."+df.format(silver.computeCost()));
			break;
		default:
			System.out.print("Invalid choice");
		}
		
		sc.close();
	}

}
