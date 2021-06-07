
public class CurrentAccount extends Account{
	private String organizationName;
	private long TIN;
	
	public CurrentAccount(String holderName, long accountNumber, String IFSCCode, long contactNumber, String organizationName, long TIN) {
		super(holderName, accountNumber, IFSCCode, contactNumber);
		this.organizationName=organizationName;
		this.TIN=TIN;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public long getTIN() {
		return TIN;
	}

	public void setTIN(long tIN) {
		TIN = tIN;
	}
	
	public void display(){
		super.display();
		System.out.println("Organization Name : "+organizationName);
		System.out.println("TIN : "+TIN);
	}

}
