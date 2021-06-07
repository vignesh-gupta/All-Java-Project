import java.text.*;

public class SavingsAccount extends Account {
	private double interestRate;
	SavingsAccount(String holderName, long accountNumber, String IFSCCode, long contactNumber, double interestRate) {
		super(holderName,accountNumber,IFSCCode,contactNumber);
		this.interestRate=interestRate;
	}
	


	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void display(){
		DecimalFormat df = new DecimalFormat("0.00");
		super.display();
		System.out.println("Interest Rate : "+df.format(interestRate));
	}
}
