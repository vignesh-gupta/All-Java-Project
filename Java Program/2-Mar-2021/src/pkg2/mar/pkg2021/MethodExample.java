/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2.mar.pkg2021;

/**
 *
 * @author aditya-srivastava
 */
class Sample
{
    //instance variable
    static int x=5,result4;
    private int num1,num2;
    int result;

    public Sample(int number1,int number2)
    {
        num1=number1;
        num2=number2;
    }
    //method to calculate sum of num1 and num2
    //this method does not accept any value and does not return result
    
    static void sum()
    {
         result4=x+x;
        System.out.println("Addition = "+x);
    }
    
    //method to calculate multiplication of num1 and num2
    //this method does not accept any value and does return result
    
    int multiplication()
    {
        result=num1*num2;
      return result;
    }
    
    int subtraction(int Fisrt, int Second)
    {
        num1=Fisrt;
        num2=Second;
       int result_sub=num1*num2;
      return result_sub;
    }
    
    
}
public class MethodExample 
{
    public static void main(String[] args)
    {
        //create the object and pass values 10 and 22 to constructor and 
        //they will be stored into num1, num2.
        int result1,result2;
        Sample s=new Sample(10, 22);
        //call the method and find sum of num1, num2
        Sample.sum();
        result1=s.multiplication();
        System.out.println("Multiplication= "+result1);
        result2=s.subtraction(6,3);
        System.out.println("Subtraction ="+result2);
        
    }
}
