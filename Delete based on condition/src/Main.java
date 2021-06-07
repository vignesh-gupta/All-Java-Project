import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		UserDAO udao=new UserDAO();
		
		Scanner sc = new Scanner(System.in);
		
		List <User> ar=new ArrayList<>();
	    ar=udao.getAllUser();
	    System.out.format("%-15s%-15s%-15s%-15s\n","Name","Mobile","Username","Password");
	    for(User u:ar){
	    	System.out.format("%-15s%-15s%-15s%-15s\n",u.getName(),u.getMobileNumber(),u.getUsername(),u.getPassword());
	    }
	    
	    System.out.println("Enter the username to be deleted:");
	    Boolean u=udao.deleteUser(sc.nextLine());
	    
	    if(u){
	    	System.out.println("User deleted successfully");
	    }else{
	    	System.out.println("User not found");
	    }
	    
	    
	    ar=udao.getAllUser();
	    System.out.format("%-15s%-15s%-15s%-15s\n","Name","Mobile","Username","Password");
	    for(User u1:ar){
	    	System.out.format("%-15s%-15s%-15s%-15s\n",u1.getName(),u1.getMobileNumber(),u1.getUsername(),u1.getPassword());
	    }

	    
		sc.close();
	}
}