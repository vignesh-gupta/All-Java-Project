import java.util.*;

 

public class Main
{
    
    public static void main(String args[]) 
    {
        
        Scanner sc=new Scanner(System.in);
        

        Integer count=0;
        
        System.out.println("Enter the number of address:");
        int n=sc.nextInt();	
        String[] state=new String[n];
        String[] city=new String[n];
        TreeMap<String,Integer> innerMap=new TreeMap<>();
        TreeMap<String,TreeMap> outerMap=new TreeMap<>();
        
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the address:");
            String address=sc.nextLine();
            String str[]=address.split(",");
            city[i]=str[1];
            state[i]= str[2];
            innerMap.put(str[1], count=1);
            outerMap.put(str[2],innerMap);    
        }
        
        System.out.println("Number of entries in city/state wise:");
        
        Set<String> omap = outerMap.keySet();
        Set<String> imap = innerMap.keySet();
         
        for(Object os:omap)
        {
        	
        	if(os==outerMap.keySet())
        	{
	            System.out.println("State:"+os);
	            for(Object is:imap)
	            {
	                System.out.println("City:"+is + " Count:" + innerMap.get(is));
	            }
        	}
        }
        sc.close();
    }
    
}