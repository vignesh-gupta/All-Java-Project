
public class Payee {
	private String name;
	private String bankName;
	private String ifscCode;
	private String aadharId;
	private Double amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Payee addPayee(String name,String bankName,String ifscCode,Double depositeAmount) {
//		this.name=name;
//		this.bankName=bankName;
//		this.ifscCode = ifscCode;
		return null;
	
	}
	
	public Payee addPayee(String aadharid,String IfscCode,Double depositeAmount) {
		return null;
	}
}
