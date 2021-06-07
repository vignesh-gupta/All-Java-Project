import java.util.Date;

public class Account {
	private String name;
	private String accountNumber;
	private double balance;
	private Date startDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	Account(String name, String accountNumber, double balance, Date startDate){
		setName(name);
		setAccountNumber(accountNumber);
		setBalance(balance);
		setStartDate(startDate);
	}
}
