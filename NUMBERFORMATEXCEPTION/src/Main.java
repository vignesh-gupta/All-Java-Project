import java.io.*;
import java.util.*;

 

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        
        
        
        try{
            System.out.println("Enter the Item type details:");
            System.out.println("Enter the name:");
            String name=sc.nextLine();
            System.out.println("Enter the deposit:");
            double deposit=Double.parseDouble(sc.nextLine());
            System.out.println("Enter the cost per day:");
            double costPerDay=Double.parseDouble(sc.nextLine());
            ItemType it=new ItemType(name, deposit, costPerDay);
            System.out.println(it.toString());
            
        }
        catch(NumberFormatException ne){
            System.out.println(ne);
        }
        
        sc.close();
        
    }
}