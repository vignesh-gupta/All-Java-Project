import java.io.IOException;
import java.util.Scanner;

 

 

 

public class Main 
{

 

 

 

    public static void main(String[] args) throws IOException 
    {
        try
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the user details");
        String s=sc.nextLine();
        String str[]=s.split(",",4);
        User u=new User(str[0], str[1], str[2], str[3] );
        UserBO.validate(u);
        System.out.println(u);
        sc.close();
        }
        catch(WeakPasswordException wpe)
        {
            System.out.println(wpe);
        }
    }

 

 

 

}