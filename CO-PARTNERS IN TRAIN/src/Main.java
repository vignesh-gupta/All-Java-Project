import java.util.*;


public class Main {

     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n+3;
        int b=n+1;
        int c=n-3;
        int d=n-1;

 

        if(n%8==1)
            System.out.println(a+"LB");
        else if(n%8==2)
            System.out.println(a+"MB");
        else if(n%8==3)
            System.out.println(a+"UB");
        else if(n%8==7)
            System.out.println(b+"SU");
        else if(n%8==4)
            System.out.println(c+"LB");
        else if(n%8==5)
            System.out.println(c+"MB");
        else if(n%8==6)
            System.out.println(c+"UB");
        else if(n%8==0)
            System.out.println(d+"SL");
        
        sc.close();
    }

 

}