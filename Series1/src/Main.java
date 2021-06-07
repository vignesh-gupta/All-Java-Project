import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int i=0;
		while(N>0)
		{
			for(i=2; i<x; i++)
			{
				if(x%i==0)
				{
					break;
				}
			}
			if(i==x)
			{
				System.out.print(x+" ");
				N--;
			}
			x++;
		}
		sc.close();
	}
}