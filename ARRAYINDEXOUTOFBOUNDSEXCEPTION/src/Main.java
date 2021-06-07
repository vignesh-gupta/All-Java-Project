import java.util.*;
public class Main {

public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of seats to be booked:");
    int seats = sc.nextInt();
    int [] s = new int[100];
    try{
        for(int i=1 ; i<=seats; i++)
        {
            System.out.println("Enter the seat number "+ i );
            int k = sc.nextInt();
            s[k-1] = 1;
        }
        System.out.println("The seats booked are:");
        for(int i = 0 ; i<100 ; i++)
        {
            if(s[i]==1)
            {
                System.out.println(1+i);
            }
        }
    }
    catch(ArrayIndexOutOfBoundsException ade)
    {
        System.out.println(ade);
    }
    sc.close();
}
}