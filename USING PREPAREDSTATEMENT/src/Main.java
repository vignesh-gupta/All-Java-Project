import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		UserDAO dao=new UserDAO();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the user detail in CSV format");
		String input=sc.nextLine();
		String[] insert = input.split(",");
		
		User u = new User(insert[0],insert[1],insert[2],insert[3]);
		dao.insertDetails(u);
		List<User> list=dao.getAllUser();
		System.out.format("%-5s %-10s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password") ;
		for(User it:list){
			System.out.format("%-5s %-10s %-15s %-10s %s\n",it.getId(),it.getName(),it.getContactDetail(),it.getUsername(),it.getPassword()) ;
		}
		
		sc.close();
	}
}