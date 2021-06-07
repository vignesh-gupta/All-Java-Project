import java.util.*;
import java.io.*;

 

public class Main 
{
    public static void main(String args[]) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        
        File file=new File("input.csv");
        BufferedReader br=new BufferedReader(new FileReader(file));
        
        ArrayList <Event> list1=EventBO.readFile(br);
        String ans="";
        
        do
        {
            System.out.println("Enter the name of the person whose events to be shown:");
            String organizer=sc.nextLine().trim();
        
            int count=0;
            
            for(Event e:list1)
            {
                if(e.getOrganizer().equalsIgnoreCase(organizer)) count++;
            }
            
            if(count>0)
            {
                System.out.printf("%-15s%-20s%-15s%-15s%-15s" , "Name", "Detail", "Type", "Attendees Count" , "Projected Expense\n");
                ArrayList <Event> list2=EventBO.eventsByPerson(list1, organizer);
                for(Event e:list2)
                {
                    System.out.println(e);
                }
            }
            else System.out.println("The given person has no upcoming events");
            
            System.out.println("Do you want to continue?(y/n)");
            ans=sc.nextLine().trim();
            
        }while(ans.equals("y"));
        
        sc.close();
        
    }
}