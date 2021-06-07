import java.util.*;
import java.io.*;

 

public class Main
{

 

    public static void main(String[] args) throws Exception
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Customer name");
        String customer=sc.nextLine().trim();
        
        System.out.println("Enter the Customer number");
        int cus_No=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the Customer address");
        String cus_Add=sc.nextLine();
        
        FileOutputStream file=new FileOutputStream("Serialize.ser");
        ObjectOutputStream oos=new ObjectOutputStream(file);
        
        Customer cus=new Customer(customer,cus_No,cus_Add);
        
        oos.writeObject(cus);
        
        oos.close();
        sc.close();
    }

 

}