import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no= sc.nextInt();
		
		for(int i=no;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
