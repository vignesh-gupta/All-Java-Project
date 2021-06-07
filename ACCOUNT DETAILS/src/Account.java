
public class Account {
	private String holderName;
	private long accountNumber;
	private String IFSCCode;
	private long contactNumber;
	
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public Account(String holderName, long accountNumber, String IFSCCode, long contactNumber){
		this.holderName = holderName;
		this.accountNumber=accountNumber;
		this.IFSCCode=IFSCCode;
		this.contactNumber=contactNumber;
	}
	
	public void display(){
		System.out.println("Your Contact Details");
		System.out.println("HolderName : "+holderName);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("IFSCCode : "+IFSCCode);
		System.out.println("ContactNumber : "+contactNumber);
	}
}
