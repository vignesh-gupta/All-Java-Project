public class Donor extends Person{
    
    public String donorType;
    public String bloodGroup;
    public String donationDate;
    
    public String getDonorType() {
        return donorType;
    }

 

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

 

    public String getBloodGroup() {
        return bloodGroup;
    }
    
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }
    
    public Donor(){}
    
    public Donor(String name, String dateOfBirth, String gender, String mobileNumber,  String bloodBankName, String donorType, String bloodGroup, String donationDate)
    {
        super(name,dateOfBirth,gender,mobileNumber,bloodBankName);
        this.donorType=donorType;
        this.bloodGroup=bloodGroup;
        this.donationDate=donationDate;
    }
    
    public void displayDonorDetails()
    {
        System.out.println("Donor Type: " + donorType );
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Donation Date: " + donationDate);
    }

 

}