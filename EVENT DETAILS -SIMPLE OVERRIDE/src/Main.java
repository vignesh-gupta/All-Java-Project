import java.util.*;

 

public class Main{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Event Name");
         String name=sc.nextLine();
         System.out.println("Enter Detail");
         String detail=sc.nextLine();
         System.out.println("Enter Organizer");
         String org=sc.nextLine();
         System.out.println("Select Event Type 1.Exhibition 2.StageEvent");
         int c=sc.nextInt();
         switch (c)
          {
             case 1:
                System.out.println("Enter stall count");
                int stall=sc.nextInt();
                Event e=new Exhibition(name,detail,org,stall);
                System.out.print(e.toString());
                e.totalCredit();
                break;
             case 2:
                System.out.println("Enter Total shows");
                int show=sc.nextInt();
                System.out.println("Enter seats per show");
                int seat=sc.nextInt();
                Event s=new StageEvent(name,detail,org,show,seat);
                System.out.println(s.toString());
                s.totalCredit();
                break;
             default:
             System.out.println("Enter valid choice");
          }
         sc.close();
    }
}