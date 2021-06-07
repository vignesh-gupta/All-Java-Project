import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of halls:");
        int n = sc.nextInt();
        sc.nextLine();
        List<Hall> hall = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
        	String h = sc.nextLine();
            String hallarr[] = h.split(",");
            hall.add(new Hall(hallarr[0], hallarr[1], Double.valueOf(hallarr[2]), hallarr[3]));
        }
        Hall.writeHallDetails(hall);
        sc.close();
	}

}
