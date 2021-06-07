import java.util.*;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an integer input");
			int a = sc.nextInt();
			System.out.println("Entered value is "+a);
			sc.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
