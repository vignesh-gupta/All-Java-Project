pppimport java.util.*;

class Operation
{
    static int num1;
	static int num2;
    char oper;
    static double result=0.00;
    
    public Operation(int n1,int n2,char oper){
    	num1=n1;
    	num2=n2;
    	this.oper=oper;
    }
    
    double cal(int a , int b , char oper){
    	num1=a;
        num2=b;
        if(oper=='A' || oper=='a')
        	sum();
        else if(oper=='M' || oper=='m')
        	multiplication();
        else if(oper=='S' || oper=='s')
        	subtraction();
        else if(oper=='D' || oper=='d')
        	division();
        else 
        	System.out.println("Invalid Selection");
        return result;
    }
    
    static void sum()
    {
         result=num1+num2;
        System.out.println("Addition = "+result);
    }

    static void multiplication()
    {
        result=num1*num2;
        System.out.println("Multiplication = "+result);
    }
    
    static void subtraction()
    {
         result=num1-num2;
        System.out.println("Subtraction = "+result);
    }
    
    static void division()
    {
        result=num1/num2;
        System.out.println("Division = "+result);
    }

    
}
public class Main 
{
    public static void main(String[] args)
    {
        int num1,num2;
        char oper;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Select the operation to perform");
        System.out.println("A for Addition");
        System.out.println("S for Subtraction");
        System.out.println("M for Multiplication");
        System.out.println("D for Division");
        oper = sc.next().charAt(0);
        sc.close();
        Operation s1=new Operation(num1,num2,oper);
        double ans = s1.cal(num1,num2,oper);
        System.out.println("Answer : "+ans);
    }
}