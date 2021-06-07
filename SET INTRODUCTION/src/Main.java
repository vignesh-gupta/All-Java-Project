import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> name = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		char ans='y';
		do{
			System.out.println("Enter the username");
			name.add(sc.next());
			System.out.println("Do you want to continue?(Y/N)");
			ans=sc.next().charAt(0);
			
		}while(ans=='y' || ans=='Y');
		
		System.out.println("The unique number of usernames is "+name.size());
		
		sc.close();
	}

}
