import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
    	System.out.println("Enter event name");
    	String name=sc.next();
        System.out.println("Enter the cost per day");
        double costPerDay=sc.nextDouble();
        System.out.println("Enter the number of days");
        int noOfDays=sc.nextInt();
        System.out.println("Enter the type of event\n1.Exhibition\n2.Stage Event");
        int type=sc.nextInt();
        
        Event event;
        if(type==1){
           
           System.out.println("Enter the number of stalls");
            int noOfStalls=sc.nextInt();
            event = new Exhibition(name,"Exhibition",costPerDay,noOfDays,
            noOfStalls);
            System.out.println(event.toString());
        }
        else if(type==2){
            System.out.println("Enter the number of seats");
            int noOfStalls=sc.nextInt();
            event = new StageEvent(name,"Stage Event", 
            costPerDay,noOfDays,noOfStalls);
            System.out.println(event.toString());
        }
        else{
            System.out.println("Invalid input");   
        }
    }
}