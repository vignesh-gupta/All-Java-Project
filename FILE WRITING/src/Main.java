import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter f = new FileWriter("output.csv");
		BufferedWriter bw = new BufferedWriter(f);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users:");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<User> a = new ArrayList<>();
        
        for(int i=0;i<n;i++){
        	System.out.println("Enter the details of user :"+(i+1));
            String details = sc.nextLine();
            String detailarr[] = details.split(",");
            a.add(new User(detailarr[0], detailarr[1], detailarr[2], detailarr[3]));
        }
        
        UserBO.writeFile(a, bw);
        
        sc.close();
	}
	
}
