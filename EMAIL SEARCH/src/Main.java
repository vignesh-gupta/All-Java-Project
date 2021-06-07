import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		Scanner sc =new Scanner(System.in);
		
		String cho,email;
		do{
			System.out.println("Enter Email address");
			email=sc.nextLine();
			hs.add(email);
			System.out.println("Do you want to Continue?(yes/no)");
			cho=sc.nextLine();
		}while(cho.equalsIgnoreCase("yes"));
		
		System.out.println("Enter the email addresses to be searched separated by comma");
		String srh=sc.nextLine();
		
		String search[] = srh.split(",");
		
        ArrayList<String> a=new ArrayList<String>();
        
        for(int i=0;i<search.length;i++){
        	a.add(search[i]);
        }
		
		
			if(hs.containsAll(a))
				System.out.println("Email addresses are present");
			else
				System.out.println("Email addresses are not present");
		
		
		sc.close();
	}

}
