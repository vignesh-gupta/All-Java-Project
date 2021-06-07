import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0 , second=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Last Number of Series : ");
		int n =sc.nextInt();
		Cal c = new Cal();
		c.FibSer(first , second , n);
		sc.close();
	}
	
}

class Cal{
	void FibSer(int f , int s , int n)
	{
		int next=0;
		System.out.print(f+" "+s+" ");
		while(next<n){
			next=f+s;
			if(next <= n)
				System.out.print(next+" ");
			else
				break;
			f=s;
			s=next;
		}
	}
}