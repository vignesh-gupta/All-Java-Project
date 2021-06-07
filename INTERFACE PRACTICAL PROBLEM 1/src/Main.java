import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
		BankFactory bankFactory = new BankFactory();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ICICI icici;
		HDFC hdfc;
		System.out.println("Welcome to Notification Setup\nPlease select your bank:\n1)ICICI\n2)HDFC");
		int select = Integer.parseInt(br.readLine());
		if(select == 1){
			icici = bankFactory.getIcici();
			System.out.println("Enter the type of Notification you want to enter\n1)SMS\n2)Mail\n3)Courier");
			int notificationChoice = Integer.parseInt(br.readLine());
			if(notificationChoice == 1){
				icici.notificationBySms();
			} else if (notificationChoice == 2){
				icici.notificationByEmail();
			}else if(notificationChoice == 3) {
				icici.notificationByCourier();
			} else {
				System.out.println("Invalid Input");
			}
		} else if(select ==2) {
			hdfc = bankFactory.getHdfc();
			System.out.println("Enter the type of Notification you want to enter\n1)SMS\n2)Mail\n3)Courier");
			int notificationChoice = Integer.parseInt(br.readLine());
			if(notificationChoice == 1){
				hdfc.notificationBySms();
			} else if (notificationChoice == 2){
				hdfc.notificationByEmail();
			}else if(notificationChoice == 3) {
				hdfc.notificationByCourier();
			} else {
				System.out.println("Invalid Input");
			}
		} else {
			System.out.println("Invalid Input");
		}
	}
}
