import java.util.*;

public class Main{


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int counter1=1;
        
        for(int i=1;i<=n;i++)
        {
            if(i<n)
            {
                int temp1=n-i;
                while (temp1>=1)
                {
                    System.out.print("b");
                    --temp1;
                }
                
                if(i>=1)
                {
                    System.out.print("*");
                }
            
                if(i>=2)
                {
                    for(int j=1;j<=counter1;j++)
                    {
                        System.out.print("i");
                    }
                    counter1+=2;
                }
                
                if(i>1)
                {
                    System.out.print("*");
                }
                
                int temp2=n-i;
                while (temp2>=1)
                {
                    System.out.print("b");
                    --temp2;
                }
            }
                
            if(i==n)
            {
                int counter2=1;
                while(counter2<=( (2*n)-1) )
                {
                    System.out.print("*");
                    ++counter2;
                }
            }    
            
            System.out.println("");
        }

        sc.close();

    }

 

}