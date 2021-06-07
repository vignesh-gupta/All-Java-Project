 	

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the name of the Aircraft");
	String aircraftName=br.readLine();
	System.out.println("Enter the source");
	String source=br.readLine();
	System.out.println("Enter the destination");
	String destination = br.readLine();
	System.out.println("Enter the type of Flight\n1.Public Aircraft\n2.Private Aircraft");
	int choice=Integer.parseInt(br.readLine());
	
	if(choice==1)
	{
		System.out.println("Is the flight check in before two hours");
		String ans = br.readLine();
		Boolean b1;
		if(ans.equals("yes"))
		{
		  b1=true;	
		}
		else
		{
			b1=false;
		}
		System.out.println("Enter the number of kgs allowed per person");
		int noOfKgsallowed=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the additional fee charged for extra baggage per Kg");
		float additionalFeeperkg=Float.parseFloat(br.readLine());
		
		
		Aircraft b = new PublicAircraft(aircraftName,source,destination,b1,noOfKgsallowed,additionalFeeperkg);
		
		b.displayDetails();
		
	}
	
	if(choice==2)
	{
		System.out.println("Is the flight check in before two hours");
		Boolean ans = Boolean.parseBoolean(br.readLine());
		System.out.println("Enter the name of the pilot chose");
		String pilotPreference=br.readLine();
		System.out.println("Enter the Purpose of your flight");
		String purpose=br.readLine();
		
		
		Aircraft b = new PrivateAircraft(aircraftName,source,destination,ans,pilotPreference,purpose);
		
		b.displayDetails();
		
	}
		
}
}
