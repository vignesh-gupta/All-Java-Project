import java.util.*;
public class Main {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int N = sc.nextInt();
        int count = P(k,N);
        System.out.println(count);
        sc.close();
    }
    public static int P(int k , int N)
    {
        int s[] = new int[N];
        int count = 0;
        for(int i = 0; i < N ; i++)
        {
            for(int j = 1 ; s[i]<=k ; j++)
            {
                if((i+j)%j==0)
                    s[i]++;
                else 
                    break;
            }
            
        }
        for(int i = 0 ; i<N ; i++)
        {
            if(s[i]==k)
                count++;
        }
        return count;
    }
}