package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayList<String> part = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		char ans='y';
		int grp,memberCount=0;
		do{
			System.out.println("Enter the Name : ");
			part.add(sc.next());
			System.out.println("Do you want to continue ?");
			ans=sc.next().charAt(0);
		}while(ans=='y' || ans=='Y');
		System.out.println(part.size());
		
		if(part.size()%5==0)
			grp=part.size()/5;
		else
			grp=(part.size()/5)+1;
		for(int i=1;i<=grp;i++){
			System.out.println("Group "+i);
			System.out.println("Participants:");
			for(int j=0;j<5;j++){
				System.out.println((j+1)+". "+part.get(memberCount));
				memberCount++;
				if(memberCount==part.size())
					break;
			}
			System.out.println("\n");
		}
		
		sc.close();
	}
	
}
