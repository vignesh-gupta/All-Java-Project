public class ICICI extends RBI{
    
        public ICICI(String accountNumber, double creditScore, String holderName) {
        super(accountNumber, creditScore, holderName);

 

        }

 

        //method for credit score calculation
        public double calculateCreditScore() {
            return (CREDIT * 0.10);
        }
}