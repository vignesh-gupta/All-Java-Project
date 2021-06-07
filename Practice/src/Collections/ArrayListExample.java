package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
    public static void main(String[] args)
    {
        //create ArrayList
        ArrayList<String> al=new ArrayList<String>();
        
        //add four objects
        al.add("Dog");
        al.add("Cat");
        al.add("Rabbit");
        al.add("Horse");
        al.add("Donkey");
        //display contents
        System.out.println("Contents: " + al);
        
        //remove two objects
        al.remove("Donkey");
        al.remove(3);
        
        System.out.println("Contents: " + al);
        
        al.add(1, "Peach");
        al.add("Kiwi");
        al.add("Peach");
        System.out.println("Contents: " + al);
        
        System.out.println("Array Size = " + al.size());
        System.out.println(al);
        //Extract elements using Iterator
        System.out.println("Extracting Using Itreator: ");
        
        //add an Iterator to ArrayList to retrieve elements
        Iterator<String> it= al.iterator();
        while(it.hasNext())
        {
            System.out.println("ArrayList Value = "+ it.next());
        }  
    }
}
