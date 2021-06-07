import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner br = new Scanner(System.in);
        System.out.println("Choose Stall Type");
        System.out.println("1)Gold Stall");
        System.out.println("2)Premium Stall");
        System.out.println("3)Executive Stall");
        
        int type = Integer.parseInt(br.nextLine());
        
        switch(type)
        {
            case 1:
                System.out.println("Enter Stall details in comma-separated(Stall Name, Stall Cost, Owner Name, Number of TV sets)");
                String st1=br.nextLine();
                String[] str1=st1.split(",");
                GoldStall gd = new GoldStall(str1[0],Integer.parseInt(str1[1]),str1[2],Integer.parseInt(str1[3]));
                gd.display();
                break;
            
            case 2:
                System.out.println("Enter Stall details in comma-separated(Stall Name, Stall Cost, Owner Name, Number of Projectors)");
                String st2=br.nextLine();
                String[] str2=st2.split(",");
                PremiumStall pm = new PremiumStall(str2[0],Integer.parseInt(str2[1]),str2[2],Integer.parseInt(str2[3]));
                pm.display();
                break;
            
            case 3:
                System.out.println("Enter Stall details in comma-separated(Stall Name, Stall Cost, Owner Name, Number of Screens)");
                String st3=br.nextLine();
                String[] str3=st3.split(",");
                ExecutiveStall ex = new ExecutiveStall(str3[0],Integer.parseInt(str3[1]),str3[2],Integer.parseInt(str3[3]));
                ex.display();
                break; 
                
            default:
                System.out.println("Invalid Stall Type");
                break;
            
        }
        
        br.close();
        
    }
}
