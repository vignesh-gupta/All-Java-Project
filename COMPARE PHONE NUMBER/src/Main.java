import java.util.Scanner;

 

public class Main
{
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Name");
        String name=sc.next();
        System.out.println("Enter UserName");
        String userName=sc.next();
        System.out.println("Enter Password");
        String password=sc.next();
        System.out.println("Enter PhoneNumber");
        long phoneNumber=sc.nextLong();
        User u1=new User(name, userName, password, phoneNumber);
        
        

 

        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter UserName");
        userName=sc.next();
        System.out.println("Enter Password");
        password=sc.next();
        System.out.println("Enter PhoneNumber");
        phoneNumber=sc.nextLong();
        User u2=new User(name,userName,password,phoneNumber);
    
        
        
        boolean isSame=u1.comparePhoneNumber(u2);
        if(isSame)
        {
            System.out.println("Same Users");
        }
        else
        {
            System.out.println("Different Users");
        }
        
        sc.close();
    }

 

}