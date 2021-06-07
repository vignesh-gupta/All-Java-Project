import java.io.*;
import java.util.*;

 

public class EventBO 
{
    
    public static ArrayList<Event> readFile(BufferedReader br) throws Exception 
    {
        ArrayList<Event> ArrayList1 = new ArrayList<>();
        String lines;
        while((lines=br.readLine())!=null)
        {
            ArrayList1.add(new Event(lines.substring(0, 19).trim(), lines.substring(19, 39).trim(), lines.substring(39, 51).trim(), lines.substring(51, 61).trim(), Integer.parseInt(lines.substring(61, 67).trim()), Double.parseDouble(lines.substring(67, 74).trim())));
        }
        return ArrayList1;
    }
    
    public static ArrayList<Event> eventsByPerson(ArrayList<Event> eventList,String organizer) 
    {
        
        ArrayList<Event> ArrayList2 = new ArrayList<>();
        
        for(Event e:eventList)
        {
            if(e.getOrganizer().equals(organizer))
            {
                ArrayList2.add(e);
            }
        }
        
        return ArrayList2;
        
    }
    
}