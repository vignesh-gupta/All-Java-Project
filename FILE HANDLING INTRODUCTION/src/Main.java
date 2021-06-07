import java.io.*;
import java.util.*;

 

public class Main 
{

 

    public static void main(String[] args) throws IOException 
    {
        
        File file=new File("input.csv");
        BufferedReader br=new BufferedReader(new FileReader(file));
        UserBO ubo=new UserBO();
        List<User> list=ubo.readFromFile(br);
        System.out.printf("%-15s %-20s %-15s %s\n", "Name", "Email", "Username", "Password");
        ubo.display(list);

 

    }

 

}