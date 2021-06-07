import java.util.*;
public class Main {
	public static void main(String[] args) {
		UserDAO dao=new UserDAO();
		List<User> list=dao.getAllUsers();
		System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password") ;
		for(User it:list){
			System.out.format("%-5s %-5s %-15s %-10s %s\n",it.getId(),it.getName(),it.getContactDetail(),it.getUsername(),it.getPassword()) ;
		}
	}
}