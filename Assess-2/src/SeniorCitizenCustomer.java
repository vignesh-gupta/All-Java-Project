
public class SeniorCitizenCustomer extends Customer{


	double generateBillAmount(Double amount) {
		
		return (amount - (0.12*amount));

	}
	
}
