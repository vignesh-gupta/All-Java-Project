/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2.mar.pkg2021;

import java.util.Scanner;

/**
 *
 * @author aditya-srivastava
 */
class Person1
{
    //instnace variable
    private String name;
    private int age;
    private int salary;
    
    
    //to accept the name and age
    public Person1(String s,int i)
    {
       //to accept data from keyword
        name=s;
        age=i;
        
    }
    public Person1(String s,int i,int sal)
    {
       //to accept data from keyword
        name=s;
        age=i;
        salary=sal;
        
    }
    
    void display()
    {
        System.out.println("Person Name= "+name);
        System.out.println("Person Age= "+age);
        System.out.println("Person Salary= "+salary);
    }
    
    
}
public class Constructor_Overload 
{
    public static void main(String[] args)
    {
        Person1 p1=new Person1("Ved", 23);
        Person1 p2=new Person1("Nupur", 45, 5000);
        p1.display();
        p2.display();
    }
}
