import java.util.*;
public class Main {

 

    @SuppressWarnings("rawtypes")
	public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of events:");
        int n = sc.nextInt();
        TreeMap<Integer , Integer> t = new TreeMap<Integer , Integer>();
        System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
        for(int i=1 ; i<=n ; i++)
        {
            String s = sc.next();
            String [] st= s.split(",");
            Integer x = Integer.parseInt(st[1]);
            Integer y = Integer.parseInt(st[2]);
            if(t.containsKey(x))
            {
                y = y+t.get(x);
                t.replace(x , t.get(x) ,y);
            }
            else
            {
                t.put(x, y);
            }
            
        }
        
        System.out.printf("%-15s %s\n", "Ticket Price" , "Tickets Booked");
        for(Map.Entry m : t.entrySet())
        {
            System.out.printf("%-15s %s\n", m.getKey() , m.getValue());
        }
        
        sc.close();
    }
}