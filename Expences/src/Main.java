import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bexp,texp,fexp,lexp;
		double exp,pbexp,ptexp,pfexp,plexp;
		DecimalFormat df= new DecimalFormat("0.00");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter branding expenses");
		bexp=sc.nextInt();
		System.out.println("Enter travel expenses");
		texp=sc.nextInt();
		System.out.println("Enter food expenses");
		fexp=sc.nextInt();
		System.out.println("Enter logistics expenses");
		lexp=sc.nextInt();
		
		
	
		exp=bexp+texp+fexp+lexp;
		System.out.println("Total expenses: Rs."+df.format(exp));
		
		pbexp=bexp*100/exp;
		ptexp=texp*100/exp;
		pfexp=fexp*100/exp;
		plexp=lexp*100/exp;

		System.out.println("Branding expenses percentage: "+df.format(pbexp)+"%");
		System.out.println("Travel expenses percentage: "+df.format(ptexp)+"%");
		System.out.println("Food expenses percentage: "+df.format(pfexp)+"%");
		System.out.println("Logistics expenses percentage: "+df.format(plexp)+"%");
		
		sc.close();
	}
}
