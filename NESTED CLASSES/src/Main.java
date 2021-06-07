import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
		String input=sc.nextLine();
		String[] a=input.split(",");
		Stall st=new Stall(a[0],a[1],a[2],Integer.parseInt(a[3]));
		Stall.GoldStall go= st.new GoldStall(Integer.parseInt(a[4]));
		Stall.GoldStall.PlatinumStall pl= go.new PlatinumStall(Integer.parseInt(a[5]));
		pl.display();
		sc.close();
	}
}