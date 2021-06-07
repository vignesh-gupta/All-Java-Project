import java.util.*;
public class Main {
	public static void main(String[] args) {
		ItemTypeDAO dao=new ItemTypeDAO();
		List<ItemType> list=dao.getAllItemTypes();
		System.out.format("%-5s %-15s %-10s %s\n","ID","Name","Deposit","Cost per day") ;
		for(ItemType it:list){
			System.out.format("%-5s %-15s %-10s %s\n",it.getId(),it.getName(),it.getDeposit(),it.getCostPerDay()) ;
		}
	}
}