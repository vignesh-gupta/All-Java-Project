import java.text.DecimalFormat;
public class BestMobilePlan {

 

    void printPlanDetails(int day, int night, int weekend)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        int payDay , payNight , payWeekend , rest=0;
        if(day > 100)
        rest = day-100;
        payDay = rest*25;
        payNight = 15*night;
        payWeekend = 20*weekend;
        double payPlanA = (payDay+payNight+payWeekend)/100.0;
        rest=0;
        if(day > 250)
        rest = day-250;
        payDay = rest*45;
        payNight = 35*night;
        payWeekend = 25*weekend;
        double payPlanB = (payDay+payNight+payWeekend)/100.0;
        System.out.println("Plan A costs "+ df.format(payPlanA));
        System.out.println("Plan B costs " + df.format(payPlanB));
        if(payPlanA==payPlanB)
            System.out.println("Plan A and B are the same price");
        else if(payPlanA < payPlanB)
            System.out.println("Plan A is cheapest");
        else System.out.println("Plan B is cheapest");
        
    }
}