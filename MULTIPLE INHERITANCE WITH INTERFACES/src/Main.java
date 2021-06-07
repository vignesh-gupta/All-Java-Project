import java.io.*;

public class Main{
       public static void main(String[] args) throws Exception, IOException{
         
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the distance travelled : ");
         Integer distance =Integer.parseInt(br.readLine());
         System.out.println("Enter the speed of the vehicle : ");
         Integer speed=Integer.parseInt(br.readLine());
         Bike b=new Bike(distance,speed);
         System.out.println("Total distance travelled : "+b.totalDistance());
         System.out.println("Average speed maintained : "+b.averageSpeed());
       }
}



