import java.text.DecimalFormat;

 

public class RBI implements Bank{
    private String accountNumber;
    private double creditScore;
    private String holderName;
    static double CREDIT;
    
    DecimalFormat df = new DecimalFormat("0.00");

 

    //getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

 

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

 

    public double getCreditScore() {
        return creditScore;
    }

 

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }

 

    public String getHolderName() {
        return holderName;
    }

 

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

 

    public static double getCREDIT() {
        return CREDIT;
    }

 

    public static void setCREDIT(double cREDIT) {
        CREDIT = cREDIT;
    }
    
    //constructor to initialize
    public RBI(String accountNumber, double creditScore, String holderName) {
        super();
        this.accountNumber = accountNumber;
        this.creditScore = creditScore;
        this.holderName = holderName;
    }

 

    //method for credit score calculation
    public double calculateCreditScore() {
        return (CREDIT * 0);
    }
    
    //required display method to get the details printed
    public void display() {
        System.out.println("Hi," + holderName
                + "\nYou have gained " + df.format(calculateCreditScore()) + " credit score for the payment of " + CREDIT
                + "\nYour Total Credit Score is " + df.format(creditScore + calculateCreditScore()));
    }
}