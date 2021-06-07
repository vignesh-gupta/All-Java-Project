import java.util.*;
import java.io.*;

 

 

 

public class Main {
    
    public static void main(String args[]) throws Exception {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        List<Hall> list=new ArrayList<>();
        HallDAO hdao=new HallDAO();
        UserDAO udao=new UserDAO();
        User u=new User();
        
        
        
        System.out.println("Enter the details of hall in csv format:");
        String str=br.readLine();
        
        String[] hStr=str.split(",");
        String name=hStr[0];
        String contactNumber=hStr[1];
        double costPerDay=Double.parseDouble(hStr[2]);
        
        System.out.println("Enter the username:");
        
        
        while(true) {
            
            String uName=br.readLine();
            u = udao.getUser(uName);
            
            if(u==null) {
                
                System.out.println("Username seems to be wrong!! Enter the correct username:");

 

            }
            else {
                
                Hall h=new Hall(name,contactNumber,costPerDay,u);
                hdao.saveHall(h);
                System.out.println("The hall details are:");
                System.out.format("%-15s%-15s%-15s%-15s\n","Name","Mobile","Cost","Owner");
                
                list=hdao.getAllHall();
                for(Hall ha:list) {
                    System.out.println(ha.toString());
                    
                }
                break;
                
            }
        }
        
        
    }
}