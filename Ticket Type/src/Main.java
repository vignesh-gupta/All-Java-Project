import java.util.*;

 

public class Main {

 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<15)
        {
            System.out.println("Child Ticket");
        }
        else
        {
            System.out.println("Adult Ticket");
        }
        sc.close();
    }

 

}