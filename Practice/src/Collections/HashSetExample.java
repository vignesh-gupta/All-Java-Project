package Collections;
import java.util.HashSet;

/*
    A HashSet represents a set of elements(Objects).
    It does not guarantee the order of elements.
    Also it does not allow the duplicate elements to be stored.
*/

public class HashSetExample
{
	public static void main(String[] args)

    {
        //create a hashset to store strings
        HashSet<String> hs=new HashSet<String>();
         //store some string elements
        hs.add("India");
        hs.add("America");
        hs.add("Japan");
        hs.add("China");
        hs.add("America");
        
        //view the HashSet
        
        System.out.println("Hash Set = "+ hs);
        
        
    }
}
