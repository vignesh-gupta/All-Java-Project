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
class Test1
{
    static int x=10;
    
   static void display()
    {
        System.out.println("Value of X= "+x);
    }
    
}
public class StaticvariableExamples
{
    public static void main(String[] args)
    {
        //create two refrences
        Test1 obj1, obj2;
        
        obj1=new Test1();
        obj2=new Test1();
        System.out.println("OBJ= "+obj1.hashCode());
         System.out.println("OBJ= "+obj2.hashCode());
        
        
        //increment x in obj1
        ++obj1.x;
        System.out.println("x in obj1");
        obj1.display();
        
        //display x in obj2
        
        System.out.println("x in obj2");
        obj2.display();
        
    }
}
