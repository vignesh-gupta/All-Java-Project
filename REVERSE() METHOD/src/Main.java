import java.io.*;
import java.util.*;

 

public class Main
{

 

    public static void main(String[] args) throws IOException
    {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of users:");
        int n=Integer.valueOf(br.readLine());
        
        ArrayList<User> ar=new ArrayList<>();
                
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the details of User " + i);
            String input=br.readLine();
            String s[]=input.split(",");
            ar.add(new User(s[0],s[1],s[2],s[3]));
        }
        
        Collections.sort(ar);
        Collections.reverse(ar);
    
        System.out.println("The user details in reverse order:");
        System.out.printf("%-15s%-15s", "Name", "Mobile number");
        System.out.println("");
        for(User a:ar)
        {
            System.out.println(a);
        }
        
    }
    
}