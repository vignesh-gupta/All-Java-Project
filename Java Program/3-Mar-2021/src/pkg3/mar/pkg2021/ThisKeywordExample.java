/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3.mar.pkg2021;

/**
 *
 * @author aditya-srivastava
 */
class Sample1
{
    private int x;

    public Sample1(int x) 
    {
       this.x=x;//refer present class instance variable
    }
    
    //method
    void access()
    {
        System.out.println("X ="+x);
    }
    
    
}
public class ThisKeywordExample 
{
    public static void main(String[] args) 
    {
        Sample1 s=new Sample1(5);
        s.access();
    }
}
