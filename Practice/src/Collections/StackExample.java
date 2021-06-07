package Collections;

import java.util.Scanner;
import java.util.Stack;

public class StackExample
{
    public static void main(String[] args) 
    {
        //create an empty stack to contain integer objects
        Stack<Integer> st=new Stack<>();
        
        int choice=0;
        int position,elements;
        Scanner sc=new Scanner(System.in);
        //display the menu as long as user choice < 4
        
        while(choice < 4)
        {
        	System.out.println("Stack Operation");
            System.out.println("1. Push an elements");
            System.out.println("2. Pop an elements");
            System.out.println("3. Search an element");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice : ");
            
            choice=sc.nextInt();
            
            //perform a task depending on user interface
            
            switch(choice)
            {
            case 1: System.out.println("Enter Elements");
            elements=sc.nextInt();
            st.push(elements );
            break;
            
        case 2: //the top-most Integer objects is popped
                Integer obj=st.pop();
            System.out.println("Popped = "+ obj);
            break;
        case 3:  System.out.println("Which Elements ?");
            elements = sc.nextInt();
            
            position=st.search(elements);
            if(position == -1)
                System.out.println("Elements not found");
            else
                System.out.println("Position : "+position);
            break;
            
        case 4:
            System.exit(0);           
            }
            //view the contents of stack
            System.out.println("Stack Contents : "+ st);
        }
        sc.close();
    }        
}

