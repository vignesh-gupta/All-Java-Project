import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Customer Details :");
        System.out.println("Enter Customer Name :");
        String name1=sc.next();
        System.out.println("Enter Customer Email :");
        String email1=sc.next();
        System.out.println("Enter Second Customer Details :");
        System.out.println("Enter Customer Name :");
        String name2=sc.next();
        System.out.println("Enter Customer Email :");
        String email2=sc.next();
        
        if(email1.equals(email2))
        	System.out.println("The Email ids of "+name1+" and "+name2+" are Equal");
        else
        	System.out.println("The Email ids of "+name1+" and "+name2+" are not equal");
        
        System.out.println("Comparing without considering the cases :");
        if(email1.equalsIgnoreCase(email2))
        	System.out.println("The Email ids of "+name1+" and "+name2+" are Equal");
        else
        	System.out.println("The Email ids of "+name1+" and "+name2+" are not equal");
        
        sc.close();
    }
}