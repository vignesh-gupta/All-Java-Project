import java.util.*;

 

public class Main
{

     public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        String stageEvent;
        String customer;
        int noOfSeats;
        String name;
        double amount=0;
        String walletNumber;
        String creditCard;
        String ccv;

 

        System.out.println("Enter the Booking details");
        String a=sc.nextLine();
        String array[]=a.split(",");
        noOfSeats=Integer.parseInt(array[2]);
        stageEvent=array[0];
        customer=array[1].trim();
        TicketBooking tb=new TicketBooking(stageEvent, customer, noOfSeats);
        System.out.println("Payment mode" +
                "\n1.Cash payment" +
                "\n2.Wallet payment" +
                "\n3.Credit card payment");
        byte mode=sc.nextByte();
        switch(mode)
        {
            case 1:
                System.out.println("Enter the amount");
                amount=sc.nextDouble();
                tb.makePayment(amount);
                break;

            case 2:
                System.out.println("Enter the amount");
                amount=sc.nextDouble();
                System.out.println("Enter the wallet number");
                walletNumber=sc.next();
                tb.makePayment(walletNumber, amount);
                break;

            case 3:
                System.out.println("Enter card holder name");
                name=sc.next();
                System.out.println("Enter the amount");
                amount=sc.nextDouble();
                System.out.println("Enter the credit card type");
                creditCard=sc.next();
                System.out.println("Enter the CCV number");
                ccv=sc.next();
                tb.makePayment(creditCard, ccv, name, amount);
                break;

            default:
                System.out.println("Invalid choice");
        }
        
        sc.close();
    }
}