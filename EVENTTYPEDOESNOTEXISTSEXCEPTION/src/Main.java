import java.util.*;
import java.io.*;

 

 

 


public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<EventType> typeList=new ArrayList<>();
        typeList.add(new EventType("Stage Event",new Long(1)));
        typeList.add(new EventType("Exhibition",new Long(2)));
        typeList.add(new EventType("Sports meet",new Long(3)));
        ArrayList<Event> list=new ArrayList<Event>();
        
        System.out.println("Enter the number of the events:");
        int num=Integer.parseInt(br.readLine());
        
        for (int i=1; i<=num; i++)
        {
            System.out.println("Enter the details of event "+i);
            String detail=br.readLine();
            String arr[]=detail.split(",");
            Event event=new Event(arr[0],arr[1],arr[2],Long.parseLong(arr[3]));
            list.add(event);
        }
        for (Event ele: list)
        {
            try 
            {
                isValid(ele.getTypeId(),typeList);
                
            } 
            catch (EventTypeDoesNotExistsException e) 
            {
                System.out.println("EventTypeDoesNotExistsException: No event type available with the given id");
                
                while (true)
                {
                    System.out.println("Enter the correct event type id:");
                    long id=Long.parseLong(br.readLine());
                    boolean flag=true;
                    try
                    {
                        isValid(id,typeList);
                    }
                    catch (EventTypeDoesNotExistsException e2)
                    {
                        System.out.println("EventTypeDoesNotExistsException: No event type available with the given id");
                        flag=false;
                    }
                    
                    if (flag)
                    {
                        ele.setTypeId(id);
                        break;
                    }
                }
            }
        }
            
        System.out.println("The events entered are:");
        System.out.printf("%-15s%-15s%-15s%-15s\n","Name","Details","Owner name","Event typeid");
        
        for (Event ele: list)
        {
        System.out.println(ele);
        }
    }
    
    public static Boolean isValid(Long typeId, List<EventType> typeList) throws EventTypeDoesNotExistsException {
       
        boolean flag=true;
        
        for (EventType ele: typeList)
        {

 

 

 

 

 

 

 

            if (typeId.equals(ele.getId()))
            { 
                flag=false;
            }
        }
        
        if (flag==true)
        {
            throw new EventTypeDoesNotExistsException();
        }
        
        return true;
    }
    
}