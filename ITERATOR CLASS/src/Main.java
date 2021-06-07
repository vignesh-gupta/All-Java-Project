import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stall details");
		int n = sc.nextInt();
		String[] stall = new String[n];
		for(int i=1;i<=n;i++){
			System.out.println("Enter the stall "+i+" detail");
			stall[i-1]=sc.nextLine();
		}
		sc.close();
	}

}
