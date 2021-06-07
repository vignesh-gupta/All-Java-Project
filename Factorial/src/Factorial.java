
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  Number : ");
		int n =sc.nextInt();
		Cal c = new Cal();
  		c.Fact(n);	
  		sc.close();
	}
}

class Cal{
	void Fact(int n)
	{
		int num=n;
		int ans=1;
		while(n>0){
			ans*=n;
			n--;
		}
		System.out.print("The Factorial of "+num+"! is : "+ans);
	}
}