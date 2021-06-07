package Collections;
import java.util.TreeSet;

public class TreeSetExample 
{
    public static void main(String[] args)
    {
        //create a hashset to store strings
        TreeSet<String> hs=new TreeSet<String>();
         //store some string elements
        hs.add("India");
        hs.add("America");
        hs.add("Japan");
        hs.add("China");
        hs.add("America");
        
        //view the HashSet
        
        System.out.println("Tree Set = "+ hs);
        
        
    }
}

