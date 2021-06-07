class TicketBooking {

 

    private String stageEvent;
    private String customer;
    private int noOfSeats;

 


    public String getStageEvent() {
        return stageEvent;
    }
    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public int getNoOfSeats() {
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

 

    public TicketBooking (){}

 

    public TicketBooking(String stageEvent, String customer, Integer noOfSeats)
    {
        this.stageEvent=stageEvent;
        this.customer=customer;
        this.noOfSeats=noOfSeats;
    }

 

    public void makePayment(double amount)
    {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Amount "+ amount +" paid in cash");
    }

 

    public void makePayment(String walletNumber , double amount)
    {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Amount "+ amount +" paid using wallet number " + walletNumber );
    }

 

    public void makePayment(String creditCard,String ccv,String name,double amount)
    {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Holder name:" + name);
        System.out.println("Amount "+ amount +" paid using " + creditCard + " card");
        System.out.println("CCV:" + ccv);
    }

 

}