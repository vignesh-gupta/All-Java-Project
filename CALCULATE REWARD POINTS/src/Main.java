import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		VISACard visaCard;
		String contd;
		do{
			System.out.println("Enter the transaction detail");
			String input=sc.next();
			String[] inputs=input.split(",");
			if(inputs[2].equals("VISA card")){
				visaCard=new VISACard();
				double reward=visaCard.computeRewardPoints(inputs[0],Double.parseDouble(inputs[1]));
				System.out.println("Total reward points earned in this transaction is "+String.format("%.2f",reward));
			}
			else if(inputs[2].equals("HPVISA card")){
				visaCard=new HPVISACard();
				double reward=visaCard.computeRewardPoints(inputs[0],Double.parseDouble(inputs[1]));
				System.out.println("Total reward points earned in this transaction is "+String.format("%.2f",reward));
			}
			else{
				System.out.println("Invalid data");
			}
			System.out.println("Do you want to continue?(Yes/No)");
			contd=sc.next();
		}while(contd.equalsIgnoreCase("Yes"));
		
		sc.close();
	}
}