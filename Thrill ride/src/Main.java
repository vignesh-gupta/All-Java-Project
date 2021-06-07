import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=15 && age<=60)
			System.out.println("Allowed");
		else
			System.out.println("Not Allowed");
		sc.close();
	}

}
