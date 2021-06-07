import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		UserDAO udao=new UserDAO();
		
		Scanner sc = new Scanner(System.in);
		
		List <User> ar=new ArrayList<>();
	    ar=udao.getAllUsers();
	    System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
	    for(User u:ar){
	    	System.out.format("%-5s %-5s %-15s %-10s %s\n",u.getId(),u.getName(),u.getContactDetail(),u.getUsername(),u.getPassword());
	    }
	    
	    System.out.println("Enter the username:");
	    User u=udao.findUserByUsername(sc.nextLine());
	    
	    if(u==null){
	    	System.out.println("No such user is present");
	    }else{
	    	System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
            System.out.format("%-5s %-5s %-15s %-10s %s\n",u.getId(),u.getName(),u.getContactDetail(),u.getUsername(),u.getPassword());
            
            System.out.println("Enter the mobile number to be updated:");
            String mobileNum=sc.nextLine();
            
            u.setContactDetail(mobileNum);
            udao.updateUser(u);
            
            System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
            System.out.format("%-5s %-5s %-15s %-10s %s\n",u.getId(),u.getName(),u.getContactDetail(),u.getUsername(),u.getPassword());
	    }

	    
		sc.close();
	}
}