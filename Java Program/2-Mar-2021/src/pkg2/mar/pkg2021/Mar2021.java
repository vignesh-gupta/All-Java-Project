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
class Person
{
    private String name;
    private int age;

    public Person() //default constructor
    {
        name="Adam";
        age=32;
        System.out.println("Hello");
    }
    
    public Person(String s, int i) //parametrized constructor
    {
        name=s;
        age=i;
    }
   //method creation
    
    void talk()
    {
        System.out.println("Hello I am "+name);
        System.out.println("My Age is "+age);
    }
    
}
public class Mar2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
            Person p1=new Person();
            //call the talk() method
            p1.talk();
            //create P2 object. Here parametrized constructor is called
            Person p2=new Person("ABC",65);
            p2.talk();
            
            
    }
    
}
