import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		int[] a = new int[n];
		String[] b = new String[n];
		System.out.println("Enter numbers : ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter strings : ");
		for(int i=0;i<n;i++){
			b[i]=sc.next();
		}
		System.out.println("Displaying numbers");
		for(int i : a){
			System.out.println(i);
		}
		System.out.println("Displaying strings");
		for(String i : b){
			System.out.println(i);
		}
		
		sc.close();
	}
}