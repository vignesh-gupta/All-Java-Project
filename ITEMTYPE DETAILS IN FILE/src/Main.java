import java.io.*;
import java.util.*;

 

public class Main 
{

 

    public static void main(String[] args)throws Exception
    {

 

        File file=new File("input.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        
        ItemTypeBO itbo=new ItemTypeBO();
        
        List<ItemType> list=itbo.readFromFile(br);
        
        if(itbo.depositList(list).isEmpty())
        {
            System.out.println("No item type has deposit more than 2000");
        }
        else
        {
            itbo.display(itbo.depositList(list));
        }

 

    }
}