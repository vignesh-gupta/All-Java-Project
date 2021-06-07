import java.util.*;

 

public class Main{

 

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int c=a, d=b;
        
        for(int i=1;i<=n;i++)
        {
            if( (i%2)!=0 )
            {
                c*=2;
            }
            else if ( (i%2)==0 )
            {
                d*=2;
            }
        }
        
        int sum=c+d;
        
        System.out.println(sum);
        
        sc.close();
    }
}