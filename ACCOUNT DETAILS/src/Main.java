import java.util.Scanner;
public class Main 
{ 
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Details(HolderName,Account Number,IFSC code,Contact Number)");        
        String details=sc.nextLine();
        String[] str=details.split(",");
        Long accNo=Long.parseLong(str[1]);
        Long conNum=Long.parseLong(str[3]);
        System.out.println("Enter Account Type");
        String type=sc.nextLine();
        if(type.equals("savings"))
        {
            System.out.println("Enter Interest Rate");
            Double i=sc.nextDouble();
            Account sa = new SavingsAccount(str[0],accNo,str[2],conNum,i);
            sa.display();
        }
        else if(type.equals("current"))
        {
            System.out.println("Enter organization Name");
            String org=sc.nextLine();
            System.out.println("Enter TIN number");
            Long tin=sc.nextLong();
            Account ca = new CurrentAccount(str[0],accNo,str[2],conNum,org,tin);
            ca.display();
        }
        else
        {
            System.out.println("Enter valid Account Type");
        }
        
        sc.close();
    } 
}