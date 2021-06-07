import java.io.*;
import java.util.*;

 

public class UserBO
{
    List<User> list=new ArrayList<User>();
    
    public List<User>readFromFile(BufferedReader br) throws IOException
    {   
        String lines;
        while((lines=br.readLine())!=null)
        {
        String str[]=lines.split(",");
        list.add(new User(str[0], str[1], str[2], str[3]));
        }
        return list;
    }
    public void display(List<User> list)
    {
        for(User u:list)
        {
            System.out.print(u);            
        }
    }
}