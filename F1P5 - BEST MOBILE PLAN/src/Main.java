import java.util.*;

public class Main {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int night = sc.nextInt();
        int weekend = sc.nextInt();
        BestMobilePlan bmp = new BestMobilePlan();
        bmp.printPlanDetails(day, night, weekend);
        sc.close();
    }

 

}