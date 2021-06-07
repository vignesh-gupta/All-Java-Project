/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.march.pkg21;
/**
 *
 * @author aditya-srivastava
 */

class Person
{
     String name="Aditya";
     int age=30;
    
    //actions --> methods
    void talk()
    {
      
        System.out.println("Hello I am="+name);
        System.out.println("My age is ="+age);
    }
}
public class March21 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //create Person class Object
        Person p1=new Person();
        Person p2;
        p2=p1;
        
        
        
        //find the hashcode of objects
        
        System.out.println("Hash Code = "+p1.hashCode());
         System.out.println("Hash Code = "+p2.hashCode());
       
        
        //calling method with the help of Person class object
        p1.talk();
        
        p1.talk();
        p2.talk();
       
        
        
        
    }
    
}
