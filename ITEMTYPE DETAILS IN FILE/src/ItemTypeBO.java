import java.util.*;
import java.io.*;

 

public class ItemTypeBO 
{
    
     public List<ItemType> readFromFile(BufferedReader br) throws Exception
     {
         List<ItemType> ItemType1 = new ArrayList<ItemType>();
           
        String lines;
        while((lines=br.readLine())!=null)
        {
            ItemType1.add(new ItemType(lines.substring(0,15), Double.parseDouble(lines.substring(15,21)), Double.parseDouble(lines.substring(21,26))));
        }
        return ItemType1;
           
      } 
     
      public List<ItemType> depositList(List<ItemType> list) 
      {
          
          List<ItemType> ItemType2 = new ArrayList<ItemType>();
          
          for(ItemType i:list)
          {
            if(i.getDeposit()>=2000)
            {
                ItemType2.add(i);
            }
          }
            
          return ItemType2;
          
      }
      
         public void display(List<ItemType> list)
         {
            System.out.printf("%-15s %-15s %s\n","Item type", "Deposit", "Cost per day");
            for(ItemType it:list)
            {
                System.out.print(it);            
            }
         }
         
}