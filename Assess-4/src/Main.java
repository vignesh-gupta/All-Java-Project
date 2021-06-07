import java.util.*;

 

public class Main {

 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Bank Name\r\n"
                            + "1.ICICI\r\n"
                            + "2.HDFC");
        
        Integer choice = Integer.valueOf(sc.nextLine());
        
        RBI obj;
        
        switch(choice)
        {
        case 1: 
//            obj = new ICICI();
            
            System.out.println("Enter the Holder Name");
            String name = sc.nextLine();
            System.out.println("Enter the Account Number");
            String accountNo = sc.nextLine();
            System.out.println("Enter the Previous Credit Score");
            double previousCreditScore = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the Amount to be Paid");
            double amt = Double.parseDouble(sc.nextLine());
            System.out.println("Amount Paid Successfully !!!");
            
            obj = new ICICI(accountNo, previousCreditScore, name);
            
            ICICI.setCREDIT(amt);
            
            obj.display();
            
            break;
            
        case 2:
            
            System.out.println("Enter the Holder Name");
            String name2 = sc.nextLine();
            System.out.println("Enter the Account Number");
            String accountNo2 = sc.nextLine();
            System.out.println("Enter the Previous Credit Score");
            double previousCreditScore2 = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the Amount to be Paid");
            double amt2 = Double.parseDouble(sc.nextLine());
            System.out.println("Amount Paid Successfully !!!");
            
            obj = new HDFC(accountNo2, previousCreditScore2, name2);
           
            HDFC.setCREDIT(amt2);
            
            obj.display();
            
            break;
            
        default:
            System.out.println("Invalid Bank type");
            
        }
        sc.close();
    }

 

}