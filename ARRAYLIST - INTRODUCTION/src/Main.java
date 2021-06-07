import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> part = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		char ans='y';
		int j=1;
		do{
			System.out.println("Enter the username "+j);
			j++;
			part.add(sc.next());
			System.out.println("Do you want to continue?(y/n)");
			ans=sc.next().charAt(0);
			
		}while(ans=='y' || ans=='Y');
		
		System.out.println("The Names entered are:");
		
		for(int i=0;i<part.size();i++){
			System.out.println(part.get(i));
		}
		
		sc.close();
	}
	
}
