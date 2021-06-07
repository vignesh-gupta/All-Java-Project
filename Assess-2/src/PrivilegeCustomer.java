
public class PrivilegeCustomer extends Customer{

	double generateBillAmount(Double amount) {
		return (amount - (0.30*amount));
	}

}
