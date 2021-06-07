import java.util.Scanner;

 

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the generated hall booking id to validate:");
        String id=sc.next();
        int count=0;
        for(int i=0;i<id.length();i++)
        {
            Character c=id.charAt(0);
            if(Character.isDigit(c))
            {
                count++;
            }
        }
        
        String regex="^[0-9]+$";
        
        if(count==id.length() && id.matches(regex))
        {
            System.out.println("Valid Booking ID");
        }
        else
        {
            System.out.println("Invalid Booking ID");
        }
        
        sc.close();
    }
}