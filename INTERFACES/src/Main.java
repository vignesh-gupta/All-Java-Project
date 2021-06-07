import java.io.*;
import java.text.*;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Current Account");
        System.out.println("2.Savings Account");
        Integer n = Integer.parseInt(br.readLine());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        switch (n) {
        case 1:
            System.out.println("Name");
            String name = br.readLine();
            System.out.println("Account Number");
            String account = br.readLine();
            System.out.println("Account Balance");
            Double accountBalance = Double.parseDouble(br.readLine());
            System.out.println("Enter the Start Date(yyyy-mm-dd)");
            String sdate = br.readLine();
            System.out.println("Enter the Years");
            Float years = Float.parseFloat(br.readLine());
            new Account(name, account, accountBalance, formatter.parse(sdate));
            CurrentAccount currentAccountObject = new CurrentAccount();
            Float outputValue =currentAccountObject.calculateMaintanceCharge(years);
            System.out.printf("Maintenance Charge For Current Account %.2f",outputValue);
            break;
        case 2:
            System.out.println("Name");
            String name_1 = br.readLine();
            System.out.println("Account Number");
            String account_1 = br.readLine();
            System.out.println("Account Balance");
            Double accountBalance_1 = Double.parseDouble(br.readLine());
            System.out.println("Enter the Start Date(yyyy-mm-dd)");
            String sdate_1 = br.readLine();
            System.out.println("Enter the Years");
            Float years_1 = Float.parseFloat(br.readLine());
            new Account(name_1, account_1, accountBalance_1, formatter.parse(sdate_1));
            SavingsAccount savingsAccountObject = new SavingsAccount();
            Float outputValue_1 = savingsAccountObject.calculateMaintanceCharge(years_1);
            System.out.printf("Maintenance Charge For Savings Account %.2f",outputValue_1);
            break;
        default:
            System.out.println("Invalid choice");
            break;
        }
    }
    
}